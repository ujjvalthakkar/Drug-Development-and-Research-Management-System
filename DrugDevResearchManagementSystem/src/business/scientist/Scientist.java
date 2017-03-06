/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.scientist;

import business.drug.Drug;
import java.util.ArrayList;

/**
 *
 * @author Harsh
 */
public class Scientist {

    private String name;
    private ArrayList<Drug> drugList;

    public Scientist() {
        drugList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Drug> getDrugList() {
        return drugList;
    }

    public void setDrugList(ArrayList<Drug> drugList) {
        this.drugList = drugList;
    }

    public Drug addDrugInList() {
        Drug d = new Drug();
        drugList.add(d);
        return d;
    }

}
