package Cartes;

import main.*;

public class CarteBleue extends Carte {
    int pointsDeVictoire;
    public CarteBleue(TypeCarte type, DosCarte back) {
        super(type, back);
        this.pointsDeVictoire = type.PDV;
    }

    @Override
    public void applique(Joueur joueur) {
        joueur.addPointsdeVictoire(this.pointsDeVictoire);
    }

}
