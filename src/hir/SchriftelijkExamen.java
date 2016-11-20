package hir;

public class SchriftelijkExamen extends Examen {
    
    public static enum Soort{OpenBoek, GeslotenBoek};
    
    private Soort soort;
    private Slot toegewezenSlot;

    public SchriftelijkExamen(Soort soort, String exNaam, int examenKans, int aantalStudenten) {
        super(exNaam, examenKans, aantalStudenten);
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
    
    
    
    
}
