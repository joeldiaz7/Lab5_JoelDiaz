package lab.pkg5_joeldiaz;

import java.util.ArrayList;

public class mazo {
    
    private double coste;
    private carta carta1;
    private carta carta2;
    private carta carta3;

    public mazo() {
    }

    public mazo(double coste, carta carta1, carta carta2, carta carta3) {
        this.coste = coste;
        this.carta1 = carta1;
        this.carta2 = carta2;
        this.carta3 = carta3;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    public carta getCarta1() {
        return carta1;
    }

    public void setCarta1(carta carta1) {
        this.carta1 = carta1;
    }

    public carta getCarta2() {
        return carta2;
    }

    public void setCarta2(carta carta2) {
        this.carta2 = carta2;
    }

    public carta getCarta3() {
        return carta3;
    }

    public void setCarta3(carta carta3) {
        this.carta3 = carta3;
    }

    @Override
    public String toString() {
        return "Mazo";
    }
    
    
}
