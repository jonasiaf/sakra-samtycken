package se.arbetsformedlingen.skyddadesamtycken.controllers;

import java.util.List;
import org.apache.commons.lang3.NotImplementedException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.arbetsformedlingen.skyddadesamtycken.model.Consent;

@RestController
@RequestMapping("consents")
public class ConsentController {

  //TODO: Implementera API
  //Anta att systemet redan är autentiserat och identifieras vid namn.
  @GetMapping(path = "/{system}")
  public List<Consent> getConsentsVisibleToSystem(String system) {
    throw new NotImplementedException("Skall returnera lista på samtycken som {system} får se."
        + "D.v.s. alla samtycken om {system} är säker, eller bara osäkra samtycken om {system} är osäker.");
  }

}
