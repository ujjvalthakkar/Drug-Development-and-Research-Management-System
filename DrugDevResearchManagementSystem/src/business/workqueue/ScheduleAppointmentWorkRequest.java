/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workqueue;

import java.util.Date;

/**
 *
 * @author Ujjval
 */
public class ScheduleAppointmentWorkRequest extends WorkRequest {
    
    private String appointmentResolution;
    private Date appointmentDate;

    public String getAppointmentResolution() {
        return appointmentResolution;
    }

    public void setAppointmentResolution(String appointmentResolution) {
        this.appointmentResolution = appointmentResolution;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }
    
}
