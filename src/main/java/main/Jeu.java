package main;

import Cartes.*;
import Jetons.JetonGuerre;
import Jetons.JetonScience;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Jeu {

    static int nombreDeJoueurs;
    static public List<Joueur> joueurs;
    public List<Carte> deckCentral;
    List<JetonScience> jetonScience;
    Boolean jeuLancé;

    public static JetonGuerre jetonGuerre;

    public Jeu(int nombreDeJoueurs, List<JetonScience> JetonScience){
        Jeu.nombreDeJoueurs = nombreDeJoueurs;
        joueurs = new ArrayList<>();
        this.jetonScience = JetonScience;
        setDeckCentral();
        shuffleDeck(this.deckCentral);

        jetonGuerre = new JetonGuerre(nombreDeJoueurs);
    }

    public static void addJoueur(Joueur nouveauJoueur){
        joueurs.add(nouveauJoueur);
    }

    public static void end() {
        Jeu.joueurs = null;
        Jeu.nombreDeJoueurs = 0;
        Jeu.jetonGuerre = null;
    }


    public void setDeckCentral(){
        this.deckCentral = new ArrayList<>();
        for(DecksCartes.QuantitéTypesCartes a: DecksCartes.deckQuantitéCartes_Extra){
            for(int i = 0; i < a.quantité; i++){
                DecksCartes.add(faireCarte(a.typecarte, DosCarte.DeckCentral));
            }
        }
    }

    static public Carte faireCarte(TypeCarte typeCarte, DosCarte deckCentral) {
        return switch (typeCarte.couleurCarte) {
            case CarteGrise -> new CarteGrise(typeCarte, deckCentral);
            case CarteVerte -> new CarteVerte(typeCarte, deckCentral);
            case CarteRouge -> new CarteRouge(typeCarte, deckCentral);
            case CarteBleue -> new CarteBleue(typeCarte, deckCentral);
        };
    }
    static public void shuffleDeck(List<Carte> deck) {
        Collections.shuffle(deck);}}