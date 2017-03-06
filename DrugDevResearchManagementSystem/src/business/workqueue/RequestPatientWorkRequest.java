/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workqueue;

/**
 *
 * @author Harsh
 */
public class RequestPatientWorkRequest extends WorkRequest{
    
    private String requestPatient;

    public String getRequestPatient() {
        return requestPatient;
    }

    public void setRequestPatient(String requestPatient) {
        this.requestPatient = requestPatient;
    }
    
    
}
