package magicBuilding.Building;

import java.util.ArrayList;
import magicBuilding.Tenants.*;

public class Building implements subject{
    
    private ArrayList<observer> tenantList = new ArrayList<observer>();
    
    public void addObserver(observer tenant){
        tenantList.add(tenant);
    }
    
    public void delObserver(String room){
        room = "my Room : " + room + "\n";
        for(int i = 0; i < tenantList.size(); i++){
            tenantBehavior tenant = (tenantBehavior)tenantList.get(i);
            if(!room.equals(tenant.speakRoom())) continue;
            tenantList.remove(i);
            break;
        }
    }
    
    public void notice(String option, int monthly){
        for(int i = 0; i < tenantList.size(); i++){
            observer tenant = tenantList.get(i);
            tenant.update(option, monthly);
        }
    }
    
    public void call(){
        for(int i = 0; i < tenantList.size(); i++){
            observer tenant = tenantList.get(i);
            tenant.call();
            // System.out.println();
        }
    }
    
}
