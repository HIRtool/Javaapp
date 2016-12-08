package hir;

import java.util.HashSet;

public class Prof {
    
    private int pnr;
    private String profVoornaam;
    private String profAchternaam;
    private HashSet<Assistent> assistenten = new HashSet<>();

    public Prof(int pnr, String profVoornaam, String profAchternaam) {
        this.pnr = pnr;
        this.profVoornaam = profVoornaam;
        this.profAchternaam = profAchternaam;
    }
    
    public void addAssistent(Assistent ass){
        assistenten.add(ass);
    }
    
    public void removeAssistent(Assistent ass){
        assistenten.remove(ass);
    }

    public int getPnr() {
        return pnr;
    }

    public void setPnr(int pnr) {
        this.pnr = pnr;
    }

    public String getProfVoornaam() {
        return profVoornaam;
    }

    public void setProfVoornaam(String profVoornaam) {
        this.profVoornaam = profVoornaam;
    }
    
    public String getProfAchternaam() {
        return profAchternaam;
    }

    public void setProfAchternaam(String profAchternaam) {
        this.profAchternaam = profAchternaam;
    }

    public HashSet<Assistent> getAssistenten() {
        return assistenten;
    }

    public void setAssistenten(HashSet<Assistent> assistenten) {
        this.assistenten = assistenten;
    }

    @Override
    public String toString() {
        return profVoornaam + " " + profAchternaam;
    }
    
    
    
}
