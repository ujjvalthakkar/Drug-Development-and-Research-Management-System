/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.scientist;

import java.util.ArrayList;

/**
 *
 * @author Harsh
 */
public class ScientistDirectory {
    
    
    private ArrayList<Scientist> scientistDirectory;

    public ScientistDirectory() {
        
        scientistDirectory = new ArrayList<>();
    }

    public ArrayList<Scientist> getScientistDirectory() {
        return scientistDirectory;
    }

    public void setScientistDirectory(ArrayList<Scientist> scientistDirectory) {
        this.scientistDirectory = scientistDirectory;
    }
    
    public Scientist addScientist(){
        
        Scientist s = new Scientist();
        scientistDirectory.add(s);
        return s;
        
    }
    
}
