/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.organization.Organization;
import business.organization.OrganizationDirectory;



/**
 *
 * @author Harsh
 */
public abstract class Enterprise extends Organization{
     private EnterpriseType enterpriseType;
     private OrganizationDirectory organizationDirectory;
     
    public Enterprise(String name,EnterpriseType type) {
        super(name);
        enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
    }
   
    public enum EnterpriseType{
        Hospital("Hospital"),Pharmacy("Pharmacy"),Market("Market");
        
       
        private String value;

        private EnterpriseType(String value) {
            this.value=value;
        }

        
        
        
        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
        
        
    }
    
    

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
}
