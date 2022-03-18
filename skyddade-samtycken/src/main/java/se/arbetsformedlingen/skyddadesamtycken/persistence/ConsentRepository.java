package se.arbetsformedlingen.skyddadesamtycken.persistence;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import se.arbetsformedlingen.skyddadesamtycken.model.Consent;

@Repository
public interface ConsentRepository extends CrudRepository<Consent, Long> {

  List<Consent> findByPerson_Name(String name);

}
