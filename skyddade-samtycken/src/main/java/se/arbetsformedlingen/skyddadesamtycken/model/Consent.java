package se.arbetsformedlingen.skyddadesamtycken.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "Consent")
@Table(name = "CONSENTS")
public class Consent extends AbstractEntity {

  public Consent(){}

  public Consent(Person person, Definition definition){
    this.person = person;
    this.definition = definition;
  }

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "PERSON", referencedColumnName = "ID")
  private Person person;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "DEFINITION", referencedColumnName = "ID")
  private Definition definition;


  public Person getPerson() {
    return person;
  }

  public void setPerson(Person person) {
    this.person = person;
  }

  public Definition getDefinition() {
    return definition;
  }

  public void setDefinition(Definition definition) {
    this.definition = definition;
  }
}
