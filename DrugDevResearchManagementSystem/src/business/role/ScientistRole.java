/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.Ecosystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.userAcoount.UserAccount;
import javax.swing.JPanel;

import userinterface.scientistWorkArea.ScientistWorkAreaJPanel;


/**
 *
 * @author bharat
 */

public class ScientistRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business,Network inNetwork) {
           return new ScientistWorkAreaJPanel(userProcessContainer, enterprise,business,account,organization);
    }
    
}
