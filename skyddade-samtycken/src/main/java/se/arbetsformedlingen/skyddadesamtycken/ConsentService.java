package se.arbetsformedlingen.skyddadesamtycken;

import java.util.List;
import se.arbetsformedlingen.skyddadesamtycken.model.Consent;

public interface ConsentService {

  /**
   * Ska enbart returnera samtycken om 'requestingSystem' kan hantera 'skyddad identitet'.
   * Anta att systemet redan är autentiserat och identifieras vid namn.
   * */
  List<Consent> findConsentsForPerson(String requestingSystem, String personName);

  void saveConsentForPerson(String requestingSystem, Long personId, Long definitionId);

}
