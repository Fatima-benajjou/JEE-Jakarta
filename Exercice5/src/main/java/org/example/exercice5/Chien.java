package org.example.exercice5;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import javax.annotation.processing.Generated;
import java.time.LocalDate;

@Entity
public class Chien {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String nom;
    private String race;
    private LocalDate date;

    public Chien() {
    }

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

    public Chien(String nom, String race, LocalDate date) {
//        this.id = id;
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

