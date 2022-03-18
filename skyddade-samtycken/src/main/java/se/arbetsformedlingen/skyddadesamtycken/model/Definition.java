package se.arbetsformedlingen.skyddadesamtycken.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "Definition")
@Table(name = "DEFINITIONS")
public class Definition extends AbstractEntity {

  public Definition(){}

  public Definition(String text){
    this.text = text;
  }

  @Column(name = "TEXT")
  private String text;

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
}
