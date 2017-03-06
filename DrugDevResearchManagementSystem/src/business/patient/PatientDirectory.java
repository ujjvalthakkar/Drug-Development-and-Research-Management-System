/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.patient;

import java.util.ArrayList;

/**
 *
 * @author Harsh
 */
public class PatientDirectory {
    private ArrayList <Patient> patientDirectory;

    public PatientDirectory() {
        patientDirectory = new ArrayList<>();
    }
    
    public ArrayList<Patient> getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(ArrayList<Patient> patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    
    public Patient addPatient(){
        Patient p = new Patient();
        patientDirectory.add(p);
        return p;
    }
    
}
