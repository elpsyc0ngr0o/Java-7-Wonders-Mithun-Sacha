package main;

import Cartes.Carte;
import Cartes.DecksCartes;
import Cartes.DosCarte;
import Cartes.Science;
import Merveilles.Merveilles;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static Merveilles.Merveilles.*;

public class Joueur {

    public Map<Science, Integer> symboleScience;
    private String nom;
    public int age;
    Merveilles merveilles;
    List<Carte> deck;

    public Joueur(String nomJoueur, int ageJoueur){
        nom = nomJoueur;
        age = ageJoueur;
        this.symboleScience = new HashMap<>();
        this.symboleScience.put(Science.Loi, 0);
        this.symboleScience.put(Science.Architecte, 0);
        this.symboleScience.put(Science.Mécanique, 0);
        }

        void SetDeck(){
            List<DecksCartes.QuantitéTypesCartes> quantitéTypesCartes = null;
            DosCarte dosCarte = null;
            switch (merveilles){
                case Gizeh:
                    quantitéTypesCartes = DecksCartes.deckQuantitéCartes_Gizeh;
                    dosCarte = DosCarte.Gizeh;
                    break;
                case Ephèse:
                    quantitéTypesCartes = DecksCartes.deckQuantitéCartes_Ephèse;
                    dosCarte = DosCarte.Ephèse;
                    break;
                case Rhodes:
                    quantitéTypesCartes = DecksCartes.deckQuantitéCartes_Rhodes;
                    dosCarte = DosCarte.Rhodes;
                    break;
                case Olympie:
                    quantitéTypesCartes = DecksCartes.deckQuantitéCartes_Olympie;
                    dosCarte = DosCarte.Olympie;
                    break;
                case Babylone:
                    quantitéTypesCartes = DecksCartes.deckQuantitéCartes_Babylone;
                    dosCarte = DosCarte.Babylone;
                    break;
                case Alexandrie:
                    quantitéTypesCartes = DecksCartes.deckQuantitéCartes_Alexandrie;
                    dosCarte = DosCarte.Alexandrie;
                    break;
                case Halicarnasse:
                    quantitéTypesCartes = DecksCartes.deckQuantitéCartes_Halicarnasse;
                    dosCarte = DosCarte.Halicarnasse;
            }
            for(DecksCartes.QuantitéTypesCartes a: quantitéTypesCartes){
                for(int i = 0; i < a.quantité; i++){
                    deck.add(Jeu.faireCarte(a.typecarte, dosCarte));
                }
            }
            Jeu.shuffleDeck(this.deck);
        }

    public void addPointsdeVictoire(int pointsDeVictoire) {

    }
}

