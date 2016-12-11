package hir;

import hir.Slot.Moment;
import java.util.Date;

public class ExamenSessie {
    
    private int ESnr;
    private int aantalStudenten; //Dit is de som van studenten die van de verschillende examens komen.
    private Date datum;
    private Moment moment;
    private int slotNr;

    public ExamenSessie(int ESnr, int aantalStudenten, int slotNr) {
        this.ESnr = ESnr;
        this.aantalStudenten = aantalStudenten;
        this.datum = null;
        this.moment = null;
        this.slotNr = slotNr;
    }

    public int getSlotNr() {
        return slotNr;
    }

    public void setSlotNr(int slotNr) {
        this.slotNr = slotNr;
    }
    
    public int getESnr() {
        return ESnr;
    }

    public void setESnr(int ESnr) {
        this.ESnr = ESnr;
    }

    public int getAantalStudenten() {
        return aantalStudenten;
    }

    public void setAantalStudenten(int aantalStudenten) {
        this.aantalStudenten = aantalStudenten;
    }

    @Override
    public String toString() {
        return ESnr + ", " + datum + " " + moment;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Moment getMoment() {
        return moment;
    }

    public void setMoment(Moment moment) {
        this.moment = moment;
    }

    
   
    
    
}
