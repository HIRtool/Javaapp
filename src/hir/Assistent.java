package hir;

import java.util.HashSet;

public abstract class Assistent {
    
    private int aNr;
    private String assVoornaam;
    private String assAchternaam;
    private Prof leidingGevendeProf;
    private HashSet<ExamenSessie> toegewezenSessies = new HashSet<>();
    private boolean isVrij;

    public Assistent(int aNr, String assVoornaam, String assAchternaam, Prof leidingGevendeProf) {
        this.aNr = aNr;
        this.assVoornaam = assVoornaam;
        this.assAchternaam = assAchternaam;
        this.leidingGevendeProf = leidingGevendeProf;
        this.isVrij = true;
    }

    //Gaat na of de assistent al genoeg examensessies heeft bijgewoond
    private void setStatusVrij(){
        isVrij = toegewezenSessies.size() < maxSurveillanties();
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
        setStatusVrij();
    }
    
    public Prof getLeidingGevendeProf() {
        return leidingGevendeProf;
    }

    public void setLeidingGevendeProf(Prof leidingGevendeProf) {
        this.leidingGevendeProf = leidingGevendeProf;
    }

    public int getANr() {
        return aNr;
    }

    public void setANr(int aNr) {
        this.aNr = aNr;
    }

    public String getAssVoornaam() {
        return assVoornaam;
    }

    public void setAssVoornaam(String assVoornaam) {
        this.assVoornaam = assVoornaam;
    }
    
    public String getAssAchternaam() {
        return assAchternaam;
    }

    public void setAssAchternaam(String assAchternaam) {
        this.assAchternaam = assAchternaam;
    }
    
    
    
}
