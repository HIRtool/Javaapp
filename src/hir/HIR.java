package hir;

import java.util.Date;
import java.util.HashSet;

public class HIR {
    
    

    public static void main(String[] args) throws DBException {
        HashSet<String> faculteiten = new HashSet<>();
        faculteiten = DBFaculteit.getFaculteiten();
        System.out.print(faculteiten);
        Date b = new Date(2016, 21, 11);
        Slot a = new Slot(15, b, Slot.Moment.NaMiddag);
        System.out.println(a .toString());
        ExamenGUI c = new ExamenGUI();
        c.show();
        c.setFaculteitLijst();
        
        
        
        
      
    }
    
}
