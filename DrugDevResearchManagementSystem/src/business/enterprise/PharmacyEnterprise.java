/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Harsh
 */
public class PharmacyEnterprise extends Enterprise{

    public PharmacyEnterprise(String name) {
        super(name,EnterpriseType.Pharmacy);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
