package magicBuilding.simulator;

import magicBuilding.Building.*;
import magicBuilding.Tenants.*;
import java.util.Scanner;

public class simulator {
    
    public static void main(String[] args){
        subject JaeseokBuilding = new Building();
        Scanner sc = new Scanner(System.in);
        while(true){
            String order = sc.next();
            if(order.equals("addTenant")){
                String tenants = sc.next();
                int monthly = sc.nextInt();
                String room = sc.next();
                observer tenant;
                if(tenants.equals("b")){
                    tenant = new bossTenant(JaeseokBuilding, monthly, room);
                }
                else if(tenants.equals("s")){
                    tenant = new studentTenant(JaeseokBuilding, monthly, room);
                }
                else{
                    tenant = new normalTenant(JaeseokBuilding, monthly, room);
                }
            }
            if(order.equals("callTenant")){
                JaeseokBuilding.call();
            }
            if(order.equals("delTenant")){
                String del = sc.next();
                JaeseokBuilding.delObserver(del);
            } 
            if(order.equals("addOption")){
                String option = sc.next();
                JaeseokBuilding.notice(option, 0);
            }
            if(order.equals("increaseRent")){
                int monthly = sc.nextInt();
                JaeseokBuilding.notice("", monthly);
            }
        }
    }
    
}
