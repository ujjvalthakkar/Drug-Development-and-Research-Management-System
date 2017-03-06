/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.drug;

import java.util.ArrayList;

/**
 *
 * @author Ujjval
 */
public class CompoundHistory {
    private ArrayList<Compound> compoundList;

    public CompoundHistory() {
        this.compoundList=new ArrayList<>();
    }
    
    public Compound addCompund(){
        Compound c=new Compound();
        this.compoundList.add(c);
        return c;
    }

    public void removeCompound(Compound d){
        compoundList.remove(d);
    }
    
    
    public ArrayList<Compound> getCompoundList() {
        return compoundList;
    }
    
}
