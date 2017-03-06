/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;


import business.Ecosystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.DoctorOrganization;
import business.organization.Organization;
import business.userAcoount.UserAccount;
import javax.swing.JPanel;
import userinterface.doctorWorkArea.DoctorWorkAreaJPanel;

/**
 *
 * @author Ujjval
 */
public class DoctorRole extends Role{

  

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business,Network inNetwork) {
       return new DoctorWorkAreaJPanel(userProcessContainer,business, account,(DoctorOrganization)organization,enterprise,inNetwork);
    }
    
    
}
