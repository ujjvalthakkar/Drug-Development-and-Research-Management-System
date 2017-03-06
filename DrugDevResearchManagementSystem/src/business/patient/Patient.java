/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.patient;

import business.vitalsigns.VitalSignHistory;

/**
 *
 * @author Ujjval
 */
public class Patient {
    private String patientName;
    private VitalSignHistory vitalSignHistory;
    private String condition = "sick";

    public Patient( ) {
        this.vitalSignHistory = new VitalSignHistory();
    }

    
    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public VitalSignHistory getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(VitalSignHistory vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }    

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return patientName; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
