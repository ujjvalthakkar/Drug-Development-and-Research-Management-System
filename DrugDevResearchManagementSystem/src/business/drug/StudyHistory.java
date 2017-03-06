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
public class StudyHistory {
    private ArrayList<Study> studyList;

    public StudyHistory() {
    this.studyList=new ArrayList<>();
    }
    
    public Study addStudy(){
        Study s=new Study();
        studyList.add(s);
        return s;
    }
}
