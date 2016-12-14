/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hirgroep11;

import java.util.Date;

/**
 *
 * @author Liesbeth
 */
public class ExamenRoosterWeergaveItem {
    
    private int exNr;
    private String exNaam;
    private Date exDatum;
    private Slot.Moment exMoment;

    public ExamenRoosterWeergaveItem(int exNr, String exNaam, Date exDatum, Slot.Moment exMoment) {
        this.exNr = exNr;
        this.exNaam = exNaam;
        this.exDatum = exDatum;
        this.exMoment = exMoment;
    }

    public int getExNr() {
        return exNr;
    }

    public String getExNaam() {
        return exNaam;
    }

    public Date getExDatum() {
        return exDatum;
    }

    public Slot.Moment getExMoment() {
        return exMoment;
    }
    
    
}
