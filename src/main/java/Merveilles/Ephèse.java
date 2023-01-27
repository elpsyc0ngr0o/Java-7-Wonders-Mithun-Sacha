package Merveilles;

import java.util.HashMap;

public class Ephèse extends Merveille{
    Ephèse(int nombreCouche) {
        super(nombreCouche);
    }

    @Override
    protected void SetCouche() {
        for (int i = 0; i< this.nombreCouche; i++){
            this.parties.add(new HashMap<>());
        }
        parties.get(0).put(2, false);
        parties.get(1).put(2, true);
        parties.get(1).put(3, true);
        parties.get(1).put(3, false);
        parties.get(2).put(4, false);
    }
}

