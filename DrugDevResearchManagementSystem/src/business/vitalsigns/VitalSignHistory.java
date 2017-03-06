/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.vitalsigns;


import java.util.ArrayList;

/**
 *
 * @author Harsh
 */
public class VitalSignHistory {
    private ArrayList<VitalSigns> vitalSignList;

    public VitalSignHistory() {
        
        vitalSignList = new ArrayList<>();
    }

    
    
    public ArrayList<VitalSigns> getVitalSignList() {
        return vitalSignList;
    }

    public void setVitalSignList(ArrayList<VitalSigns> vitalSignList) {
        this.vitalSignList = vitalSignList;
    }
    
    public VitalSigns addVitals(){
        VitalSigns v = new VitalSigns();
        vitalSignList.add(v);
        return v;
        
    }
    
}
