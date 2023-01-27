package Cartes;

import Merveilles.Merveilles;

public enum DosCarte {
    DeckCentral(null), //

    Alexandrie(Merveilles.Alexandrie), //
    Halicarnasse(Merveilles.Halicarnasse),
    Ephèse(Merveilles.Ephèse), //
    Olympie(Merveilles.Olympie), //,
    Babylone(Merveilles.Babylone), //
    Rhodes(Merveilles.Rhodes), //
    Gizeh(Merveilles.Gizeh); //

    public final boolean deckCentral;
    public final Merveilles deckMerveille;

    private DosCarte(Merveilles deckMerveille) {
        this.deckCentral = (deckMerveille == null);
        this.deckMerveille = deckMerveille;
}
}
