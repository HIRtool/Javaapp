package hir;

import java.util.HashSet;

public class ExamenSessie {
    
    private int ESnr;
    private int aantalStudenten; //Dit is de som van studenten die van de verschillende examens komen.
    private Lokaal toegewezenLokaal;
    private int slotNr;

    public ExamenSessie(int ESnr, int aantalStudenten, Lokaal toegewezenLokaal, int slotNr) {
        this.ESnr = ESnr;
        this.aantalStudenten = aantalStudenten;
        this.toegewezenLokaal = toegewezenLokaal;
        this.slotNr = slotNr;
    }

    public int getSlotNr() {
        return slotNr;
    }

    public void setSlotNr(int slotNr) {
        this.slotNr = slotNr;
    }
    
    public int getESnr() {
        return ESnr;
    }

    public void setESnr(int ESnr) {
        this.ESnr = ESnr;
    }

    public int getAantalStudenten() {
        return aantalStudenten;
    }

    public void setAantalStudenten(int aantalStudenten) {
        this.aantalStudenten = aantalStudenten;
    }

    
   
    
    
}
