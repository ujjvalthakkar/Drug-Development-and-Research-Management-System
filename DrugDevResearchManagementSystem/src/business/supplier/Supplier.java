/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.supplier;

import business.drug.CompoundHistory;

/**
 *
 * @author Ujjval
 */
public class Supplier {
    private String name;
    private CompoundHistory compoundHistory;

    public Supplier() {
        compoundHistory = new CompoundHistory();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CompoundHistory getCompoundHistory() {
        return compoundHistory;
    }

    public void setCompoundHistory(CompoundHistory compoundHistory) {
        this.compoundHistory = compoundHistory;
    }

    @Override
    public String toString() {
        return name; 
    }
    
    
}
