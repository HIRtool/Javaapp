package hirgroep11;

import java.util.HashSet;

public class Vakgroep {
    
    private String vakgrNaam;
    private Adres adres;
    private HashSet<Prof> proffen = new HashSet<>();

    public Vakgroep(String vakgrNaam, Adres adres) {
        this.vakgrNaam = vakgrNaam;
        this.adres = adres;
    }
    
    public void addProf(Prof pr){
        proffen.add(pr);
    }
    
    public void removeProf(Prof pr){
        proffen.remove(pr);
    }
    
    public boolean hasProf(Prof pr){
        return proffen.contains(pr);
    }

    public HashSet<Prof> getProffen() {
        return proffen;
    }

    public void setProffen(HashSet<Prof> proffen) {
        this.proffen = proffen;
    }
    
    public String getVakgrNaam() {
        return vakgrNaam;
    }

    public void setVakgrNaam(String vakgrNaam) {
        this.vakgrNaam = vakgrNaam;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }
    
    
}
