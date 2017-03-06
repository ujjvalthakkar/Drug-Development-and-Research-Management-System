/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.Ecosystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.userAcoount.UserAccount;

import userinterface.systemAdminWorkArea.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Ujjval
 */
public class SystemAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem system,Network inNetwork) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, system);
    }
}
