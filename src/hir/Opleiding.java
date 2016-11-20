package hir;

import java.util.HashSet;

public class Opleiding {
    
    private String oplNaam;
    private int aantalStudenten;
    private int opleidingsduur;
    private HashSet<Opleidingsonderdeel> opleidingsOnderdelen = new HashSet<>();
    private OpleidingsCommissie opleidingsCommissie;

    public Opleiding(String oplNaam, int aantalStudenten, int opleidingsduur) {
        this.oplNaam = oplNaam;
        this.aantalStudenten = aantalStudenten;
        this.opleidingsduur = opleidingsduur;
    }
    
    public void addOpleidingsOnderdeel(Opleidingsonderdeel oplOnd){
        opleidingsOnderdelen.add(oplOnd);
    }
    
    public void removeOpleidingsOnderdeel(Opleidingsonderdeel oplOnd){
        opleidingsOnderdelen.remove(oplOnd);
    }

    public HashSet<Opleidingsonderdeel> getOpleidingsOnderdelen() {
        return opleidingsOnderdelen;
    }

    public void setOpleidingsOnderdelen(HashSet<Opleidingsonderdeel> opleidingsOnderdelen) {
        this.opleidingsOnderdelen = opleidingsOnderdelen;
    }

    public OpleidingsCommissie getOpleidingsCommissie() {
        return opleidingsCommissie;
    }

    public void setOpleidingsCommissie(OpleidingsCommissie opleidingsCommissie) {
        this.opleidingsCommissie = opleidingsCommissie;
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
    
    
}
