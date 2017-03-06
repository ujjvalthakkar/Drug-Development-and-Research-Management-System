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
public class Drug {

    private int drugNumber;
    private String drugName;
    private String uses;
    private String manufacture;
    private String clinicalTrialStatus;
    private ArrayList<Compound> copoundComposition;
    private String description;
    private static int count =1;

    public Drug() {
        
        copoundComposition = new ArrayList<>();
        drugNumber = count;
        count ++;
        
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getUses() {
        return uses;
    }

    public void setUses(String uses) {
        this.uses = uses;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getClinicalTrialStatus() {
        return clinicalTrialStatus;
    }

    public void setClinicalTrialStatus(String clinicalTrialStatus) {
        this.clinicalTrialStatus = clinicalTrialStatus;
    }

    public ArrayList<Compound> getCopoundComposition() {
        return copoundComposition;
    }

    public void setCopoundComposition(ArrayList<Compound> copoundComposition) {
        this.copoundComposition = copoundComposition;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDrugNumber() {
        return drugNumber;
    }

    @Override
    public String toString() {
        return drugName; //To change body of generated methods, choose Tools | Templates.
    }
   



}
