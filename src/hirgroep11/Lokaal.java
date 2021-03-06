package hirgroep11;

import java.util.HashSet;

public class Lokaal {
    
    private String lokaalNaam;
    private Adres adres;
    private int capaciteit;

    public Lokaal(String lokaalNaam, Adres adres, int capaciteit) {
        this.lokaalNaam = lokaalNaam;
        this.adres = adres;
        this.capaciteit = capaciteit;
    }

    public String getLokaalNaam() {
        return lokaalNaam;
    }

    public void setLokaalNaam(String lokaalNaam) {
        this.lokaalNaam = lokaalNaam;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public int getCapaciteit() {
        return capaciteit;
    }

    public void setCapaciteit(int capaciteit) {
        this.capaciteit = capaciteit;
    }
    public String toString(){
    return this.getAdres().getStraat() + " " + this.getLokaalNaam() + " (" + this.getCapaciteit() + ")";
}
    public HashSet<Lokaal> LokalenUpdaten() throws DBException{
        HashSet<Lokaal> vrijeLokalen = new HashSet<>();
        vrijeLokalen.addAll(DBLokaal.getLokalen());
        //@TODO: aanvullen
        
        return null;
        
    }
    
}
    
    
    

