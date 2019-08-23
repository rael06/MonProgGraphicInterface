package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MonProg implements ActionListener, WindowListener {
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

    protected Button bouton;
    protected TextField champTexte;
    protected Label etiquette;

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

        barre_de_menu.add(menu_application);
        barre_de_menu.add(menu_utilisateur);

        bouton = new Button("Appuyer");
        champTexte = new TextField();
        etiquette = new Label("Resultat");

        menu_utilisateur.add(item_initialiser);
        menu_utilisateur.add(sous_menu_modifier);
        menu_application.add(item_quitter);

        sous_menu_modifier.add(item_nom);
        sous_menu_modifier.add(item_age);

        fenetre = new Frame("Titre de la fenêtre");
        fenetre.setBounds(50, 100, 500, 300);
        fenetre.setMenuBar(barre_de_menu);
        fenetre.setVisible(true);

        fenetre.setLayout(null);
        bouton.setBounds(20, 50, 100, 50);
        champTexte.setBounds(20, 110, 100, 50);
        etiquette.setBounds(20, 180, 100, 50);
        fenetre.add(bouton);
        fenetre.add(champTexte);
        fenetre.add(etiquette);

        item_quitter.addActionListener(this);
        item_initialiser.addActionListener(this);
        item_nom.addActionListener(this);
        item_age.addActionListener(this);

        fenetre.addWindowListener(this);
        bouton.addActionListener(this);

        System.out.println(fenetre.getWidth() + " " + fenetre.getHeight());
    }

    public static void main(String[] args) {
        MonProg ol = new MonProg();
        ol.setNom("Pierre");
        System.out.println("Bonjour " + ol.getNom());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == item_quitter) {
            System.out.println("On quitte le programme");
            System.exit(0);
        }
        if (e.getSource() == item_initialiser) System.out.println("On initialise le programme");
        if (e.getSource() == item_nom) System.out.println("On modifie le nom");
        if (e.getSource() == item_age) System.out.println("On modifie l'age");
        if (e.getSource() == bouton) {
            System.out.println("On a appuyé sur le bouton");
            etiquette.setText(etiquette.getText() + " " + champTexte.getText());
            System.out.println("Une action s'est produite");
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("On quitte le programme");
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
