package hir;

import java.util.HashSet;

public class MondelingExamen extends Examen {
    
    private int maxAantalStudenten;
    private HashSet<Slot> toegewezenSlots = new HashSet<>();

    public MondelingExamen(int maxAantalStudenten, String exNaam, int examenKans, int aantalStudenten) {
        super(exNaam, examenKans, aantalStudenten);
        this.maxAantalStudenten = maxAantalStudenten;
    }

    public int getMaxAantalStudenten() {
        return maxAantalStudenten;
    }

    public void setMaxAantalStudenten(int maxAantalStudenten) {
        this.maxAantalStudenten = maxAantalStudenten;
    }

    public HashSet<Slot> getToegewezenSlots() {
        return toegewezenSlots;
    }

    public void setToegewezenSlots(HashSet<Slot> toegewezenSlots) {
        this.toegewezenSlots = toegewezenSlots;
    }

    
    
    
}
