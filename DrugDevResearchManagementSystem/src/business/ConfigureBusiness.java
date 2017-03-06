/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import Business.Employee.Employee;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.role.SystemAdminRole;
import business.userAcoount.UserAccount;

/**
 *
 * @author Harsh
 */
public class ConfigureBusiness {
    public static Ecosystem configure(){
        
        Ecosystem system = Ecosystem.getInstance();
        //Create a network
//        Network network=new Network();
//        network.setName("Boston");
//        system.getNetworkList().add(network);
//        //create an enterprise
//        Enterprise hospitalEnterprise=network.getEnterpriseDirectory().createAndAddEnterprise("Hospital", Enterprise.EnterpriseType.Hospital);
//        Organization doctorOrganization=hospitalEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.Doctor);
//        //doctorOrganization.setName("Doctor Organization");
//        Organization patientOrganization=hospitalEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.Patient);
//        
//        Enterprise pharmaEnterprise=network.getEnterpriseDirectory().createAndAddEnterprise("Pharma", Enterprise.EnterpriseType.Pharmacy);
//        Organization scientistOrganization=pharmaEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.Scientist);
//        
//        Enterprise marketEnterprise=network.getEnterpriseDirectory().createAndAddEnterprise("Market", Enterprise.EnterpriseType.Market);
//        Organization supplierOrganization=marketEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.Supplier);
                
        
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        return system;
    }
}
