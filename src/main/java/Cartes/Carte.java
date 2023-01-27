package Cartes;
import main.*;

public abstract class Carte {
    public final TypeCarte type;
    public final DosCarte dos;

    public Carte(TypeCarte type, DosCarte dos) {
        this.type = type;
        this.dos = dos;

    }

    public abstract void applique(Joueur joueur);
}