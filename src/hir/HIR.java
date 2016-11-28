package hir;

import java.util.HashSet;

public class HIR {
    
    

    public static void main(String[] args) throws DBException {
        HashSet<Faculteit> faculteiten = new HashSet<>();
        faculteiten = DBFaculteit.getFaculteiten();
        System.out.print(faculteiten);
    }
    
}
