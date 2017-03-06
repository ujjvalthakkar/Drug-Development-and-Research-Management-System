/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.supplier;

import java.util.ArrayList;

/**
 *
 * @author Ujjval
 */
public class SupplierDirectory {
    private ArrayList<Supplier> suppliersList;

    public SupplierDirectory() {
        suppliersList = new ArrayList<>();
    }

    public ArrayList<Supplier> getSuppliersList() {
        return suppliersList;
    }

    public void setSuppliersList(ArrayList<Supplier> suppliersList) {
        this.suppliersList = suppliersList;
    }
    
    public Supplier addSupplier(){
        Supplier s = new Supplier();
        suppliersList.add(s);
        return s;
        
    }
    
}
