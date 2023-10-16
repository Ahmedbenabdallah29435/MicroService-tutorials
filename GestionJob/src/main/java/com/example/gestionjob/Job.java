package com.example.gestionjob;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String service;
    private boolean etat; // boolean attribute

    // Default constructor
    public Job() {
    }

    // Constructor with service and etat parameters
    public Job(String service, boolean etat) {
        this.service = service;
        this.etat = etat;
    }

    // Getter and setter for id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter and setter for service
    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    // Getter and setter for etat
    public boolean isEtat() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", service='" + service + '\'' +
                ", etat=" + etat +
                '}';
    }
}
