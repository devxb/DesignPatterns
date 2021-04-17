package Cafe24;

import java.util.*;

public class Main {
    public static void main(String[] args){
        coffeeMachine cf = new Americano();
        Scanner sc = new Scanner(System.in);
        while(true){
            String str = sc.next();
            if(str.equals("Americano") == true){
                cf.setCoffeeType(new dripAmericano());
            }
            else if(str.equals("ColdBrew") == true){
                cf.setCoffeeType(new dripColdBrew());
            }
            else if(str.equals("Latte") == true){
                cf.setCoffeeType(new dripLatte());
            }
            else{
                System.out.println("Error! Input : " + str);
                continue;
            }
            cf.dripCoffee();
        }
    }
}
