package hir;

public class SchriftelijkExamen extends Examen {
    
    public static enum Soort{OpenBoek, GeslotenBoek};
    
    private Soort soort;
    private Slot toegewezenSlot;

    public SchriftelijkExamen(Soort soort, int exNr, String exNaam, int examenKans, int aantalStudenten, Opleidingsonderdeel oplOnd) {
        super(exNr, exNaam, examenKans, aantalStudenten, oplOnd);
        this.soort = soort;
    }

    public Soort getSoort() {
        return soort;
    }

    public void setSoort(Soort soort) {
        this.soort = soort;
    }

    public Slot getToegewezenSlot() {
        return toegewezenSlot;
    }

    public void setToegewezenSlot(Slot toegewezenSlot) {
        this.toegewezenSlot = toegewezenSlot;
    }

    @Override
    public String toString() {
        if (getExNaam().equals(getOpleidingOnderdeel().getOplOndNaam())){
            return getExNaam() + " (Schriftelijk)";
        } else {
            return getOpleidingOnderdeel().getOplOndNaam() + " - " + getExNaam() + " (Schriftelijk)"; 
        }
        
    }
    
    
    
    
}
