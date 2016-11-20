package hir;

public abstract class Examen {
    
    private String exNaam;
    private int examenKans;
    private int aantalStudenten;

    public Examen(String exNaam, int examenKans, int aantalStudenten) {
        this.exNaam = exNaam;
        this.examenKans = examenKans;
        this.aantalStudenten = aantalStudenten;
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
    
    
}
