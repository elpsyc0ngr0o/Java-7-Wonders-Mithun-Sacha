package Merveilles;

import java.util.HashMap;
import java.util.Map;

public class Alexandrie extends Merveille {

    Alexandrie(int nombreCouche) {
        super(nombreCouche);
    }

    @Override
    protected void SetCouche() {
        for (int i = 0; i< this.nombreCouche; i++){
            this.parties.add(new HashMap<>());
        }
        parties.get(0).put(2, false);
        parties.get(1).put(2, true);
        parties.get(2).put(3, false);
        parties.get(3).put(3, true);
        parties.get(4).put(4, false);
    }
}
