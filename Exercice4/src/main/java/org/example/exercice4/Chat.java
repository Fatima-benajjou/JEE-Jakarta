package org.example.exercice4;

import java.time.LocalDate;

public class Chat {
    private String nom;
    private String race;
    private String repas;
    private LocalDate date;


    public Chat(String nom, String race, String repas, LocalDate date) {
        this.nom = nom;
        this.race = race;
        this.repas = repas;
        this.date= date;
    }

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

    public String getRepas() {
        return repas;
    }

    public void setRepas(String repas) {
        this.repas = repas;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
