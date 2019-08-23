package com.company;

import java.awt.*;

public class MonProg {
    protected String nom;

    protected Frame fenetre;

    protected MenuBar barre_de_menu;

    protected Menu menu_application;
    protected Menu menu_utilisateur;
    protected Menu sous_menu_modifier;

    protected MenuItem item_quitter;
    protected MenuItem item_initialiser;
    protected MenuItem item_nom;
    protected MenuItem item_age;

    public void setNom(String n) {
        nom = n;
    }

    public String getNom() {
        return nom;
    }

    public MonProg() {
        nom = "inconnu";

        barre_de_menu = new MenuBar();
        menu_application = new Menu("Application");
        menu_utilisateur = new Menu("Utilisateur");
        sous_menu_modifier = new Menu("Modifier");
        item_quitter = new MenuItem("Quitter");
        item_initialiser = new MenuItem("Initialiser");
        item_nom = new MenuItem("Nom");
        item_age = new MenuItem("Age");

        sous_menu_modifier.add(item_nom);
        sous_menu_modifier.add(item_age);
        menu_utilisateur.add(item_initialiser);
        menu_utilisateur.add(sous_menu_modifier);
        menu_application.add(item_quitter);
        barre_de_menu.add(menu_application);
        barre_de_menu.add(menu_utilisateur);

        fenetre = new Frame("Titre de la fenêtre");
        fenetre.setBounds(50, 100, 500, 300);
        fenetre.setMenuBar(barre_de_menu);
        fenetre.setVisible(true);
    }

    public static void main(String[] args) {
        MonProg ol = new MonProg();
        ol.setNom("Pierre");
        System.out.println("Bonjour " + ol.getNom());
    }
}
