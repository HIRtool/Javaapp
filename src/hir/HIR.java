package hir;

import java.util.HashSet;

public class HIR {
    
    

    public static void main(String[] args) throws DBException {
        HashSet<String> faculteiten = new HashSet<>();
        faculteiten = DBFaculteit.getFaculteiten();
        System.out.print(faculteiten);
        ExamenGUI2 a = new ExamenGUI2();
        a.show();
    }
    
}
