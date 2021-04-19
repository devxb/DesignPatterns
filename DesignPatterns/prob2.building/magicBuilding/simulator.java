package magicBuilding;

import magicBuilding.*;
import magicBuilding.Jaeseok.*;
import magicBuilding.tenants.*;
import java.util.Scanner;

public class simulator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        building myBuilding = new building(); // 재석이의 건물
        jaeseok jaeseok = new jaeseok(myBuilding); // 재석이
        while(true){
            String order = sc.next(); // 명령받기
            if(order.equals("addTenant")){
                int Rent = sc.nextInt();
                String Room = sc.next();
                tenant tenant = new tenant(myBuilding, Rent, Room);
            }
            if(order.equals("callTenant")){
                myBuilding.callTenant();
            }
            if(order.equals("delTenant")){
                String Room = sc.next();
                myBuilding.delTenant(Room);
            }
            if(order.equals("addOption")){
                String option = sc.next();
                jaeseok.addOption(option);
            }
            if(order.equals("increaseRent")){
                int rent = sc.nextInt();
                jaeseok.increaseRent(rent);
            }
        }
    }
}
