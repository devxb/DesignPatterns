package prob5_CoffeeFactory.Simulator;

import prob5_CoffeeFactory.CoffeeFactory.*;
import prob5_CoffeeFactory.Robot.*;
import java.util.Scanner;

public class Simulator {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Robot robot = new Robot();
        while(true){
            String coffeeName = sc.next();
            Command coffee;
            if(coffeeName.equals("CaffeLatte")) coffee = new CaffeLatte();
            else if(coffeeName.equals("IceAmericano")) coffee = new IceAmericano();
            else if(coffeeName.equals("Espresso")) coffee = new Espresso();
            else {
                System.out.println("Error!");
                continue;
            }
            System.out.println("....dripCoffee....");
            robot.setCoffee(coffee);
            robot.dripCoffee();
        }
    }
    
}
