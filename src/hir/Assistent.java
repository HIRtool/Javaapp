package hir;

import java.util.HashSet;

public abstract class Assistent {
    
    private int assNr;
    private String assNaam;
    private Prof leidingGevendeProf;
    private HashSet<ExamenSessie> toegewezenSessies = new HashSet<>();
    private boolean isVrij;

    public Assistent(int assNr, String assNaam, Prof leidingGevendeProf) {
        this.assNr = assNr;
        this.assNaam = assNaam;
        this.leidingGevendeProf = leidingGevendeProf;
        this.isVrij = true;
    }

    //Gaat na of de assistent al genoeg examensessies heeft bijgewoond
    private boolean checkStatusVrij(){
        return toegewezenSessies.size() < maxSurveillanties();
    }
    
    //Haalt de maximale surveillanties op
    public abstract int maxSurveillanties();
    
    //Kijkt eerst of de assistent nog vrij is, en past nadien ook, indien nodig, de status aan
    public void addSurveillantieSessie(ExamenSessie exSes) throws Exception{
        if(isVrij){
            toegewezenSessies.add(exSes);}
        else
        {
            throw new Exception("Assistent heeft geen vrije surveillanties meer");
        }
        checkStatusVrij();
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
