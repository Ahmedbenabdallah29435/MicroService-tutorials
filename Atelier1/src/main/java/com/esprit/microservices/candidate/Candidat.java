package com.esprit.microservices.candidate;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Candidat implements Serializable {
    private static final long serialVersionUID = 6;

    @Id
    @GeneratedValue
    private int id;
    private String nom;
    private String prenom;
    private String email;

    public int getId() {


return id;  }

    public String getNom() {

return nom;  }

    public void setNom (String nom) {this.nom = nom;}

    public String getPrenom() {

return prenom;  }

    public void setPrenom (String prenom) { this.prenom=prenom;
    }
    public String getEmail() {

return email;  }
    public void setEmail(String email) { this.email = email;
    }
    public Candidat() {

super();  }
    // TODO Auto-generated constructor stub

    public Candidat(String nom, String prenom, String email) {

        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
    }
}