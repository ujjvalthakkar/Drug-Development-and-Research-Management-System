/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.drug;

import business.patient.Patient;
import java.util.ArrayList;

/**
 *
 * @author Ujjval
 */
public class Study {

    private String studyName;
    private String recruitmentStatus; // InProgress or completed
    private int recruitmentNumber;
    private ArrayList<Patient> patientList;
    private String informationProvidedBy;// DoctorName
    private String phase; // Phase 1 or Phase 2

    public Study() {
        patientList = new ArrayList<>();
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }
    
    

    public int getRecruitmentNumber() {
        return recruitmentNumber;
    }

    public void setRecruitmentNumber(int recruitmentNumber) {
        this.recruitmentNumber = recruitmentNumber;
    }

    public String getStudyName() {
        return studyName;
    }

    public void setStudyName(String studyName) {
        this.studyName = studyName;
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }

    public String getRecruitmentStatus() {
        return recruitmentStatus;
    }

    public void setRecruitmentStatus(String recruitmentStatus) {
        this.recruitmentStatus = recruitmentStatus;
    }

    public String getInformationProvidedBy() {
        return informationProvidedBy;
    }

    public void setInformationProvidedBy(String informationProvidedBy) {
        this.informationProvidedBy = informationProvidedBy;
    }

    public void addPatient(Patient p) {
        patientList.add(p);
    }

}
