package hir;

import java.util.HashSet;

public class Prof {
    
    private int pnr;
    private String profNaam;
    private HashSet<Assistent> assistenten = new HashSet<>();

    public Prof(int pnr, String profNaam) {
        this.pnr = pnr;
        this.profNaam = profNaam;
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

    public String getProfNaam() {
        return profNaam;
    }

    public void setProfNaam(String profNaam) {
        this.profNaam = profNaam;
    }

    public HashSet<Assistent> getAssistenten() {
        return assistenten;
    }

    public void setAssistenten(HashSet<Assistent> assistenten) {
        this.assistenten = assistenten;
    }
    
    
    
}
