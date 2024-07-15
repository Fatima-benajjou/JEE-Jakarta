package org.example.exercice5;

import java.time.LocalDate;

public class Chien {
    private int id;
    private String nom;
    private String race;
    private LocalDate date;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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


    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Chien(int id, String nom, String race, LocalDate date) {
        this.id = id;
        this.nom = nom;
        this.race = race;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Chien{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", race='" + race + '\'' +
                ", date=" + date +
                '}';
    }
}

