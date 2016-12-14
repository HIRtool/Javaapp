package hirgroep11;

import java.util.HashSet;

public class MondelingExamen extends Examen {
    
    private int maxAantalStudenten;
    private HashSet<Slot> toegewezenSlots = new HashSet<>();

    public MondelingExamen(int maxAantalStudenten, int exNr, String exNaam, int examenKans, int aantalStudenten, Opleidingsonderdeel oplOnd) {
        super(exNr, exNaam, examenKans, aantalStudenten, oplOnd);
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

    
    @Override
    public String toString() {
        if (getExNaam().equals(getOpleidingOnderdeel().getOplOndNaam())){
            return getExNaam() + " (Mondeling)";
        } else {
            return getOpleidingOnderdeel().getOplOndNaam() + " - " + getExNaam() + " (Mondeling)"; 
        }
        
    }
    
}
