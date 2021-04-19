package magicBuilding;

import java.util.ArrayList;
import magicBuilding.tenants.*;

public class building implements subject{
    
    private ArrayList<tenant> tenantList = new ArrayList<tenant>();
    private String options;
    private int rent;
    
    public void addTenant(tenant tenant){
        tenantList.add((tenant)tenant);
    }
    
    public void changeOption(String options){
        this.options = options;
        notice();
    }
    
    public void changeRent(int rent){
        this.rent += rent;
        notice();
    }
    
    public void delTenant(String Room){
        for(int i = 0; i < tenantList.size(); i++){
            if(tenantList.get(i).cancel(Room)) tenantList.remove(tenantList.get(i));
        }
    }
    
    public void notice(){
        for(int i = 0; i < tenantList.size(); i++){
            tenant nowTenant = tenantList.get(i);
            nowTenant.update(this.rent, this.options);
        }
    }
    
    public void callTenant(){
        for(int i = 0; i < tenantList.size(); i++){
            tenant nowTenant = (tenant)tenantList.get(i);
            nowTenant.behavior();
        }
    }
    
}
