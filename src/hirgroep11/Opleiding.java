package hirgroep11;

import java.util.HashSet;

public class Opleiding {
    
    private String oplNaam;
    private int aantalStudenten;
    private int opleidingsduur;
    private HashSet<Opleidingsonderdeel> opleidingsOnderdelen = new HashSet<>();
    private Faculteit facNaam;

    public Opleiding(String oplNaam, int aantalStudenten, int opleidingsduur, Faculteit facNaam) {
        this.oplNaam = oplNaam;
        this.aantalStudenten = aantalStudenten;
        this.opleidingsduur = opleidingsduur;
        this.facNaam = facNaam;
    }

    public boolean hasOpleidingsonderdeel(Opleidingsonderdeel oplOnd){
        return opleidingsOnderdelen.contains(oplOnd);
    }
    
    public void addOpleidingsonderdeel(Opleidingsonderdeel oplOnd){
        opleidingsOnderdelen.add(oplOnd);
    }
    
    public String getOplNaam() {
        return oplNaam;
    }

    public void setOplNaam(String oplNaam) {
        this.oplNaam = oplNaam;
    }

    public int getAantalStudenten() {
        return aantalStudenten;
    }

    public void setAantalStudenten(int aantalStudenten) {
        this.aantalStudenten = aantalStudenten;
    }

    public int getOpleidingsduur() {
        return opleidingsduur;
    }

    public void setOpleidingsduur(int opleidingsduur) {
        this.opleidingsduur = opleidingsduur;
    }

    public HashSet<Opleidingsonderdeel> getOpleidingsOnderdelen() {
        return opleidingsOnderdelen;
    }

    public void setOpleidingsOnderdelen(HashSet<Opleidingsonderdeel> opleidingsOnderdelen) {
        this.opleidingsOnderdelen = opleidingsOnderdelen;
    }

    public Faculteit getFacNaam() {
        return facNaam;
    }

    public void setFacNaam(Faculteit facNaam) {
        this.facNaam = facNaam;
    }

    public String toString(){
        return getOplNaam();
    }
    
    
}
