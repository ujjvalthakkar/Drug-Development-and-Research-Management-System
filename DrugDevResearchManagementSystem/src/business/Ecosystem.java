/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.network.Network;
import business.organization.Organization;
import business.role.Role;
import business.role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Harsh
 */
public class Ecosystem extends Organization{
    private static Ecosystem business;
    private ArrayList<Network> networkList;
    
    private Ecosystem(){
        super (null);
        networkList = new ArrayList<Network>();
    }
    
    public static Ecosystem getInstance(){
        if (business == null){
            business=new Ecosystem();
        }
        return business;
    }
    
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public Network createAndAddNetwork(){
        Network n = new Network();
        networkList.add(n);
        return n;
    }
    
    public boolean checkIfUserNameIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
           }
        for(Network network:networkList){
            
        }
        return true;
    }
    
    
}
