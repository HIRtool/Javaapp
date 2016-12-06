package hir;

public abstract class Examen {
    
    private int exNr;
    private String exNaam;
    private int examenKans;
    private int aantalStudenten;
    private Opleiding opleiding;

    public Examen(int exNr, String exNaam, int examenKans, int aantalStudenten, Opleiding opleiding) {
        this.exNr = exNr;
        this.exNaam = exNaam;
        this.examenKans = examenKans;
        this.aantalStudenten = aantalStudenten;
        this.opleiding = opleiding;
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
    
    
}
