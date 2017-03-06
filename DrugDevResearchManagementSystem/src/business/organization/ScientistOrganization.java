/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.role.Role;
import business.role.ScientistRole;
import java.util.ArrayList;

/**
 *
 * @author Harsh
 */
public class ScientistOrganization extends Organization{

    public ScientistOrganization() {
      super(Organization.Type.Scientist.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
    ArrayList<Role> roles = new ArrayList();
        roles.add(new ScientistRole());
        return roles;
    }

    
    
}
