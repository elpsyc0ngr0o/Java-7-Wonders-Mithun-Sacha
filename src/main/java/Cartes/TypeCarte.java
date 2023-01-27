package Cartes;

public enum TypeCarte {

    CarteBleueEmpereur("politique:empereur", 3),
    CarteGriseBois("matériel:bois", Matériel.Bois),
    CarteGriseBrique("matériel:brique", Matériel.Brique),
    CarteGriseOr("matériel:or", Matériel.Or),
    CarteGrisePapier("matériel:papier", Matériel.Papier),
    CarteGrisePierre("matériel:pierre", Matériel.Pierre),
    CarteGriseVerre("matériel:verre", Matériel.Verre),
    CarteRougeArcher("guerre:archer", 1, 2),
    CarteRougeBarbare("guerre:barbare", 1, 1),
    CarteRougeCenturion("guerre:centurion", 1, 0),
    CarteVerteArchitecte("science:architecte", Science.Architecte),
    CarteVerteLoi("science:loi", Science.Loi),

    CarteVerteMécanique("science:mécanique", Science.Mécanique);
    public final String nomCarte;
    public final CouleurCarte couleurCarte;

    public final Matériel matériel;

    public final Science science;

    public final int bouclier;
    public final int cors;


    public final int PDV;

    private TypeCarte(String nomCarte, CouleurCarte couleurCarte, Matériel matériel, Science science, int bouclier, int cors, int PDV) {
        this.nomCarte = nomCarte;
        this.couleurCarte = couleurCarte;
        this.matériel = matériel;
        this.science = science;
        this.bouclier = bouclier;
        this.cors = cors;
        this.PDV = PDV;
    }

    private TypeCarte(String nomCarte, Matériel matériel) {
        this(nomCarte, CouleurCarte.CarteGrise, matériel, null, 0, 0, 0);
    }

    private TypeCarte(String nomCarte, Science science) {
        this(nomCarte, CouleurCarte.CarteVerte, null, science, 0, 0, 0);
    }

    private TypeCarte(String nomCarte, int bouclier, int cors) {
        this(nomCarte, CouleurCarte.CarteRouge, null, null, bouclier, cors, 0);
    }

    private TypeCarte(String nomCarte, int PDV) {
        this(nomCarte, CouleurCarte.CarteBleue, null, null, 0, 0, PDV);
    }

    }
