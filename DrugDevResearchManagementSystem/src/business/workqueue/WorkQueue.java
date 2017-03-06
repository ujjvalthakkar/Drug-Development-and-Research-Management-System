/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workqueue;

import java.util.ArrayList;

/**
 *
 * @author bharat
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
}