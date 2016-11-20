package hir;

public abstract class Assistent {
    
    private int assNr;
    private String assNaam;
    private Prof leidingGevendeProf;

    public Assistent(int assNr, String assNaam, Prof leidingGevendeProf) {
        this.assNr = assNr;
        this.assNaam = assNaam;
        this.leidingGevendeProf = leidingGevendeProf;
    }

    public Prof getLeidingGevendeProf() {
        return leidingGevendeProf;
    }

    public void setLeidingGevendeProf(Prof leidingGevendeProf) {
        this.leidingGevendeProf = leidingGevendeProf;
    }

    public int getAssNr() {
        return assNr;
    }

    public void setAssNr(int assNr) {
        this.assNr = assNr;
    }

    public String getAssNaam() {
        return assNaam;
    }

    public void setAssNaam(String assNaam) {
        this.assNaam = assNaam;
    }
    
    
    
}
