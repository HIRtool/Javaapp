package hir;

public class SchriftelijkExamen extends Examen {
    
    public static enum Soort{OpenBoek, GeslotenBoek};
    
    private Soort soort;
    private Slot toegewezenSlot;

    public SchriftelijkExamen(Soort soort, int exNr, String exNaam, int examenKans, int aantalStudenten, Opleiding opl) {
        super(exNr, exNaam, examenKans, aantalStudenten, opl);
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
