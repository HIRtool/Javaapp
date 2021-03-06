package hirgroep11;

import java.util.HashSet;

public class Opleidingsonderdeel {
    
    private String oplOndNaam;
    private int modelTrajectJaar;
    private int aantalStudenten;
    private int semester;
    private Examen examen; //Niet verplicht aanwezig
    private OpleidingsCommissie opleidingsCommissie;
    private Prof verantwoordelijkeLesgever;
    private HashSet<Prof> medelesgevers = new HashSet<>();

    public Opleidingsonderdeel(String oplOndNaam, int modelTrajectJaar, int aantalStudenten, int semester, OpleidingsCommissie opleidingsCommissie, Prof verantwoordelijkeLesgever) {
        this.oplOndNaam = oplOndNaam;
        this.modelTrajectJaar = modelTrajectJaar;
        this.aantalStudenten = aantalStudenten;
        this.semester = semester;
        this.opleidingsCommissie = opleidingsCommissie;
        this.verantwoordelijkeLesgever = verantwoordelijkeLesgever;
    }
    
    public boolean hasMedelesgever(Prof medelesgever){
        return medelesgevers.contains(medelesgever);
    }
    
    public void addMedelesgever(Prof medelesgever){
        medelesgevers.add(medelesgever);
    }
    
    public void removeMedelesgever(Prof medelesgever){
        medelesgevers.remove(medelesgever);
    }

    public OpleidingsCommissie getOpleidingsCommissie() {
        return opleidingsCommissie;
    }

    public void setOpleidingsCommissie(OpleidingsCommissie opleidingsCommissie) {
        this.opleidingsCommissie = opleidingsCommissie;
    }

    public Prof getVerantwoordelijkeLesgever() {
        return verantwoordelijkeLesgever;
    }

    public void setVerantwoordelijkeLesgever(Prof verantwoordelijkeLesgever) {
        this.verantwoordelijkeLesgever = verantwoordelijkeLesgever;
    }

    public HashSet<Prof> getMedelesgevers() {
        return medelesgevers;
    }

    public void setMedelesgevers(HashSet<Prof> medelesgevers) {
        this.medelesgevers = medelesgevers;
    }

    public String getOplOndNaam() {
        return oplOndNaam;
    }

    public void setOplOndNaam(String oplOndNaam) {
        this.oplOndNaam = oplOndNaam;
    }

    public int getModelTrajectJaar() {
        return modelTrajectJaar;
    }

    public void setModelTrajectJaar(int modelTrajectJaar) {
        this.modelTrajectJaar = modelTrajectJaar;
    }

    public int getAantalStudenten() {
        return aantalStudenten;
    }

    public void setAantalStudenten(int aantalStudenten) {
        this.aantalStudenten = aantalStudenten;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public Examen getExamen() {
        return examen;
    }

    public void setExamen(Examen examen) {
        this.examen = examen;
    }
    
    public String toString(){
        return getOplOndNaam();
    }
    
}
