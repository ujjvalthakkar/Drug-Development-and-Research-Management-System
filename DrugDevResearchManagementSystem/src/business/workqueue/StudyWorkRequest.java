/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workqueue;

import business.drug.Drug;
import business.drug.Study;

/**
 *
 * @author Ujjval
 */
public class StudyWorkRequest extends WorkRequest{
    
    private Study study;
    private Drug drug;

    public StudyWorkRequest() {
        this.drug = new Drug();
        study=new Study();
    }

    public Study getStudy() {
        return study;
    }

    public void setStudy(Study study) {
        this.study = study;
    }
    
    
    
    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }

    @Override
    public String toString() {
        return this.study.getStudyName(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
