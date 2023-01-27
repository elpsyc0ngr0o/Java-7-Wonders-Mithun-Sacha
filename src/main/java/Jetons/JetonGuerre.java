package Jetons;

public class JetonGuerre {
    int nombreJetonGuerre;
    int nombreJetonGuerreTourner;

    public JetonGuerre(int n){
        nombreJetonGuerre = n;
        nombreJetonGuerreTourner = 0;
        if(n == 2) nombreJetonGuerre++;
        if(n == 7) nombreJetonGuerre--;
    }

    public boolean toutJetonGuerreTourner() {
        if(nombreJetonGuerre == nombreJetonGuerreTourner){
            this.nombreJetonGuerreTourner = 0;
            return true;
        }
        return false;
    }

    public void tournerJetonGuerre(int n){
        nombreJetonGuerreTourner += n;
        if(nombreJetonGuerreTourner > this.nombreJetonGuerre)
        {
            nombreJetonGuerreTourner = this.nombreJetonGuerre;
        }
    }
}
