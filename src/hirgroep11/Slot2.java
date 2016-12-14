package hirgroep11;

import java.util.Date;
import java.util.HashSet;

public class Slot2 {
    
    public static enum Moment{VoorMiddag, NaMiddag};
    private final int AANTAL_SLOTS = 48;
    private int slotNr;
    private Date datum;
    private Moment moment;
    private HashSet<Examen> examenLijst;
    private Date startdatum ;

    public Slot2(int slotNr, Date datum, Moment moment) {
        this.slotNr = slotNr;
        this.datum = datum;
        this.moment = moment;
        this.examenLijst  = new HashSet<>();
        
    }

    public int getAANTAL_SLOTS() {
        return AANTAL_SLOTS;
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
    
    public void momentBerekenen(int slotnummer) {
        double a = slotnummer;
        if(a%2 != 0){
            
            this.moment = Moment.VoorMiddag;
           
        } else{
            this.moment = Moment.NaMiddag;
        }
         
        
        
    }
    
    
    public void datumBerkenen(int slotnummer) {
        double a = Math.ceil(slotnummer/2);
        int weeks = 0;
        weeks = (int)Math.ceil((a-1)/6);
        double days=0;
        int weks = (int)Math.floor(a/6);
        int dagen=slotnummer - weks*6-1;
        this.datum = this.startdatum ;
        
    }
    
}
