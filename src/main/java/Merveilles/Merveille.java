package Merveilles;

import java.util.List;
import java.util.Map;

public abstract class Merveille {

    int nombreCouche;
    List<Map<Integer, Boolean>> parties;

    Merveille(int nombreCouche){
        this.nombreCouche = nombreCouche;
        SetCouche();
    }
    protected abstract void SetCouche();

}
