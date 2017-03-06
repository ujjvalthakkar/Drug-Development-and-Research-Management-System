/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import Business.Employee.EmployeeDirectory;
import business.patient.PatientDirectory;

import business.role.Role;
import business.scientist.ScientistDirectory;
import business.supplier.SupplierDirectory;
import business.userAcoount.UserAccountDirectory;
import business.workqueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Ujjval
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private SupplierDirectory supplierDirectory;
    private ScientistDirectory scientistDirectory;
    private PatientDirectory patientDirectory;
    private int organizationID;
    private static int counter = 0;

    public enum Type {
        Admin("Admin Organization"), Doctor("Doctor Organization"),
        Patient("Patient Organization"), Scientist("Scientist Organization"),
        SalesPerson("SalesPerson Organization"), Supplier("Supplier Organization");
        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
        
        if (this.name == "Supplier Organization") {
            supplierDirectory = new SupplierDirectory();
            
        }

        if (this.name == "Scientist Organization") {
            scientistDirectory = new ScientistDirectory();
            
        }

        if (this.name == "Patient Organization") {
            patientDirectory = new PatientDirectory();
            
        }
    }

    public abstract ArrayList<Role> getSupportedRole();

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public SupplierDirectory getSupplierDirectory() {
        return supplierDirectory;
    }

    public ScientistDirectory getScientistDirectory() {
        return scientistDirectory;
    }

    public void setScientistDirectory(ScientistDirectory scientistDirectory) {
        this.scientistDirectory = scientistDirectory;
    }

    @Override
    public String toString() {
        return name;
    }

}
