package Cartes;

import main.Joueur;

public class CarteRouge extends Carte{
        int nombreCors;
        public CarteRouge(TypeCarte type, DosCarte back) {
            super(type, back);
            this.nombreCors = type.cors;
        }

    @Override
    public void applique(Joueur joueur) {

    }

}
