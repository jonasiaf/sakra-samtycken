package se.arbetsformedlingen.skyddadesamtycken.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "Person")
@Table(name = "PERSONS")
public class Person extends AbstractEntity {

  public Person() {}

  public Person(String name) {
    this.name = name;
  }

  @Column(name = "NAME")
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
