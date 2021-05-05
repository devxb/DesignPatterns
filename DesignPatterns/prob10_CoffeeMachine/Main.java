package prob10_CoffeeMachine;

import java.io.*;
import prob10_CoffeeMachine.Coffee.*;

public class Main {
    
    public static void main(String[] args){
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            try{
                String coffee = bf.readLine();
                Drip drip = smallFactory(coffee);
                if(drip == null) continue;
                coffeeMachine.changeCoffee(drip);
                coffeeMachine.drip();
            }catch (IOException ioe){}
        }
    }
    
    public static Drip smallFactory(String str){
        if(str.equals("Americano")) return new Americano();
        if(str.equals("CafeLatte")) return new CafeLatte();
        if(str.equals("ColdBrew")) return new ColdBrew();
        return null;
    }
    
}
