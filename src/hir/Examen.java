package hir;

public abstract class Examen {
    
    private int exNr;
    private String exNaam;
    private int examenKans;
    private int aantalStudenten;
    private Opleidingsonderdeel opleidingOnderdeel;
    private Slot slot;

    public Examen(int exNr, String exNaam, int examenKans, int aantalStudenten, Opleidingsonderdeel opleidingOnderdeel) {
        this.exNr = exNr;
        this.exNaam = exNaam;
        this.examenKans = examenKans;
        this.aantalStudenten = aantalStudenten;
        this.opleidingOnderdeel = opleidingOnderdeel;
    }

    public Opleidingsonderdeel getOpleidingOnderdeel() {
        return opleidingOnderdeel;
    }

    public void setOpleidingOnderdeel(Opleidingsonderdeel opleidingOnderdeel) {
        this.opleidingOnderdeel = opleidingOnderdeel;
    }

    public int getExNr() {
        return exNr;
    }

    public void setExNr(int exNr) {
        this.exNr = exNr;
    }

    
    public String getExNaam() {
        return exNaam;
    }

    public void setExNaam(String exNaam) {
        this.exNaam = exNaam;
    }

    public int getExamenKans() {
        return examenKans;
    }

    public void setExamenKans(int examenKans) {
        this.examenKans = examenKans;
    }

    public int getAantalStudenten() {
        return aantalStudenten;
    }

    public void setAantalStudenten(int aantalStudenten) {
        this.aantalStudenten = aantalStudenten;
    }

    public Slot getSlot() {
        return slot;
    }

    public void setSlot(Slot slot) {
        this.slot = slot;
    }
    
    
    
}
