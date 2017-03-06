/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.drug.CompoundHistory;
import business.role.Role;
import business.role.SupplierRole;
import java.util.ArrayList;

/**
 *
 * @author Harsh
 */
public class SupplierOrganization extends Organization{
    
    
    

    public SupplierOrganization() {
        
        super(Organization.Type.Supplier.getValue());
        
        
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
     ArrayList<Role> roles = new ArrayList();
        roles.add(new SupplierRole());
        return roles;
    }


    
}
