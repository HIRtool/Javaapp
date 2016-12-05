package hir;

import java.util.HashSet;

public class ExamenSessie {
    
    private int ESnr;
    private int aantalStudenten; //Dit is de som van studenten die van de verschillende examens komen.
    private HashSet<Examen> Examens = new HashSet<>();
    private Lokaal toegewezenLokaal;
    private HashSet<Assistent> surveillanten = new HashSet<>();
    private Slot slot;

    public ExamenSessie(int ESnr, int aantalStudenten, Lokaal toegewezenLokaal) {
        this.ESnr = ESnr;
        this.aantalStudenten = aantalStudenten;
        this.toegewezenLokaal = toegewezenLokaal;
        this.slot = slot;
    }

    public Slot getSlot() {
        return slot;
    }

    public void setSlot(Slot slot) {
        this.slot = slot;
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

    public HashSet<Examen> getExamens() {
        return Examens;
    }

    public void setExamens(HashSet<Examen> Examens) {
        this.Examens = Examens;
    }

    public Lokaal getToegewezenLokaal() {
        return toegewezenLokaal;
    }

    public void setToegewezenLokaal(Lokaal toegewezenLokaal) {
        this.toegewezenLokaal = toegewezenLokaal;
    }

    public HashSet<Assistent> getSurveillanten() {
        return surveillanten;
    }

    public void setSurveillanten(HashSet<Assistent> surveillanten) {
        this.surveillanten = surveillanten;
    }
    
    
    
    
}
