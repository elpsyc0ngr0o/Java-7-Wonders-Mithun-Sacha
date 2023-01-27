package Cartes;

import Cartes.Carte;
import Cartes.DosCarte;
import Cartes.Science;
import Cartes.TypeCarte;
import main.Joueur;


public class CarteVerte extends Carte {
    Science science;
    public CarteVerte(TypeCarte type, DosCarte back) {
        super(type, back);
        Science Science = type.science;
    }

    @Override
    public void applique(Joueur joueur) {

    }
}