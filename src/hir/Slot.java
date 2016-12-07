package hir;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;

public class Slot {
    
    public static enum Moment{VoorMiddag, NaMiddag};
    
    private int slotNr;
    private Date datum;
    private Moment moment;
    private HashSet<Examen> examenLijst = new HashSet<>();

    public Slot(int slotNr, Date datum, Moment moment) {
        this.slotNr = slotNr;
        this.datum = datum;
        this.moment = moment;
    }

    public int getSlotNr() {
        return slotNr;
    }

    public void setSlotNr(int slotNr) {
        this.slotNr = slotNr;
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

    public HashSet<Examen> getExamenLijst() {
        return examenLijst;
    }

    public void setExamenLijst(HashSet<Examen> examenLijst) {
        this.examenLijst = examenLijst;
    }
    public String toString(){
        String datumString = new SimpleDateFormat("dd/MM/yyyy").format(datum);
        return datumString + " " + this.moment;
    } 
            
    public Slot fromString(String slotString) throws DBException{
        for(Slot a : DBSlot.loadSlots())
            if(a.toString().equals(slotString)){
                return a;
            }
        return null;
    }
    
}
