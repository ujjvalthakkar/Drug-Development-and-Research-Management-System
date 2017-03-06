/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

;
import business.organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author bharat
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Patient.getValue())){
            organization = new PatientOrganization();
            organizationList.add(organization);
            
        }
        else if (type.getValue().equals(Type.Scientist.getValue())){
            organization = new ScientistOrganization();
            organizationList.add(organization);
        }
          else if (type.getValue().equals(Type.SalesPerson.getValue())){
            organization = new SalesPersonOrganization();
            organizationList.add(organization);
        }
            else if (type.getValue().equals(Type.Supplier.getValue())){
            organization = new SupplierOrganization();
            organizationList.add(organization);
        }
        return organization;
    
}
}