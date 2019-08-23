package com.company;

import java.awt.*;

public class MonProg {
    protected String nom;

    protected Frame fenetre;

    public void setNom (String n) {
        nom = n;
    }

    public String getNom () {
        return nom;
    }

    public MonProg () {
        nom = "inconnu";
        fenetre = new Frame("Titre de la fenêtre");
        fenetre.setBounds(50, 100, 500, 300);
        fenetre.setVisible(true);
    }

    public static void main (String[] args) {
        MonProg ol = new MonProg();
        ol.setNom("Pierre");
        System.out.println("Bonjour " + ol.getNom());
    }
}
