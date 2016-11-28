package hir;

import java.util.HashSet;

public class Faculteit {
    
    private String facNaam;
    private String decaan;
    public HashSet<Opleiding> opleidingen = new HashSet<>(); 
    private Adres adres;
    private HashSet<Vakgroep> vakgroepen = new HashSet<>();
    
    

    public Faculteit(String facNaam, String decaan, Adres adres) {
        this.facNaam = facNaam;
        this.decaan = decaan;
        this.adres = adres;
        
    }

    public void addOpleiding(Opleiding opl){
        opleidingen.add(opl);
    }
    
    public void removeOpleiding(Opleiding opl){
        opleidingen.remove(opl);
    }
    
    public void addVakgroep(Vakgroep vakgr){
        vakgroepen.add(vakgr);
    }
    
    public String getFacNaam() {
        return facNaam;
    }

    public void setFacNaam(String facNaam) {
        this.facNaam = facNaam;
    }

    public String getDecaan() {
        return decaan;
    }

    public void setDecaan(String decaan) {
        this.decaan = decaan;
    }

    public HashSet<Opleiding> getOpleidingen() {
        return opleidingen;
    }

    public void setOpleidingen(HashSet<Opleiding> opleidingen) {
        this.opleidingen = opleidingen;
    }
    
    public boolean opleidingenHasOpleiding (Opleiding opl)
    {
        return opleidingen.contains(opl);
    }
    
    public boolean hasVakgroep (Vakgroep vakgr)
    {
        return vakgroepen.contains(vakgr);
    }
    
    public HashSet<Vakgroep> getVakgroepen() {
        return vakgroepen;
    }

    public void setVakgroepen(HashSet<Vakgroep> vakgroepen) {
        this.vakgroepen = vakgroepen;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }
    
    
}
