package hir;

import java.util.HashSet;

public class Opleidingsonderdeel {
    
    private String oplOndNaam;
    private int modelTrajectJaar;
    private int aantalStudenten;
    private int semester;
    private Examen examen;
    private Prof verantwoordelijkeLesgever;
    private HashSet<Prof> medelesgevers = new HashSet<>();

    public Opleidingsonderdeel(String oplOndNaam, int modelTrajectJaar, int aantalStudenten, int semester, Prof verantwoordelijkeLesgever) {
        this.oplOndNaam = oplOndNaam;
        this.modelTrajectJaar = modelTrajectJaar;
        this.aantalStudenten = aantalStudenten;
        this.semester = semester;
        this.verantwoordelijkeLesgever = verantwoordelijkeLesgever;
    }
    
    public void addMedelesgever(Prof medelesgever){
        medelesgevers.add(medelesgever);
    }
    
    public void removeMedelesgever(Prof medelesgever){
        medelesgevers.remove(medelesgever);
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
    
    
    
}
