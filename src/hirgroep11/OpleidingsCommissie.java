package hirgroep11;

public class OpleidingsCommissie {
    
    private String oplComNaam;
    private Prof voorzitter;
    private Opleiding opleiding;

    public OpleidingsCommissie(String oplComNaam, Prof voorzitter, Opleiding opleiding) {
        this.oplComNaam = oplComNaam;
        this.voorzitter = voorzitter;
        this.opleiding = opleiding;
    }

    public String getOplComNaam() {
        return oplComNaam;
    }

    public void setOplComNaam(String oplComNaam) {
        this.oplComNaam = oplComNaam;
    }

    public Prof getVoorzitter() {
        return voorzitter;
    }

    public void setVoorzitter(Prof voorzitter) {
        this.voorzitter = voorzitter;
    }

    public Opleiding getOpleiding() {
        return opleiding;
    }

    public void setOpleiding(Opleiding opleiding) {
        this.opleiding = opleiding;
    }
    
    
    
}
