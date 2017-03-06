/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import java.util.ArrayList;

/**
 *
 * @author Harsh
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        
        enterpriseList = new ArrayList<Enterprise>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    
    //create enterprise 
    
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
       Enterprise enterprise = null;
       if(type==Enterprise.EnterpriseType.Hospital){
           enterprise = new HospitalEnterprise(name);
           enterpriseList.add(enterprise);
           
       }
       if(type==Enterprise.EnterpriseType.Pharmacy){
           enterprise = new PharmacyEnterprise(name);
           enterpriseList.add(enterprise);
           
       }
       if(type==Enterprise.EnterpriseType.Market){
           enterprise = new MarketEnterprise(name);
           enterpriseList.add(enterprise);
           
       }
       return enterprise;
    }
    
}
