package se.arbetsformedlingen.skyddadesamtycken.persistence;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import se.arbetsformedlingen.skyddadesamtycken.model.Consent;
import se.arbetsformedlingen.skyddadesamtycken.model.Definition;
import se.arbetsformedlingen.skyddadesamtycken.model.Person;

@DataJpaTest
class ConsentRepositoryTest {

  @Autowired
  ConsentRepository consentRepository;

  @Test
  void shouldPersist(){
    Person person = new Person("Adam");
    Definition definition = new Definition("Jag samtycker.");
    Consent consent = new Consent(person, definition);

    Consent savedConsent = consentRepository.save(consent);
    Consent foundConsent = consentRepository.findById(savedConsent.getId()).get();

    assertAll(
        () -> assertNotNull(foundConsent.getPerson()),
        () -> assertNotNull(foundConsent.getDefinition()),
        () -> assertEquals(foundConsent.getPerson().getName(), person.getName()),
        () -> assertEquals(foundConsent.getDefinition().getText(), definition.getText())
    );
  }

  @Test
  void shouldPersistByName(){
    Person person = new Person("Adam");

    //Save two consents for Adam.
    consentRepository.save(new Consent(person, new Definition("Jag samtycker.")));
    consentRepository.save(new Consent(person, new Definition("Jag samtycker också.")));
    //Save a third consent for a different person.
    consentRepository.save(new Consent(new Person("Berit"), new Definition("Jag samtycker också.")));

    List<Consent> foundConsents = consentRepository.findByPerson_Name("Adam");

    assertAll(
        () -> assertEquals(2, foundConsents.size(), "should find two consents for Adam.")
    );
  }

}