package org.example.exercice5;

import java.time.LocalDate;

public class Chien {
    private String nom;
    private String race;
    private LocalDate date;


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }


    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Chien(String nom, String race, LocalDate date) {
        this.nom = nom;
        this.race = race;
        this.date = date;
    }
}

