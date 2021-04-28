package prob5_CoffeeFactory.Robot;

import prob5_CoffeeFactory.CoffeeFactory.*;

public class Robot {
    private Command coffee;
    
    public void setCoffee(Command coffee){
        this.coffee = coffee;
    }
    
    public void dripCoffee(){
        coffee.execute();
    }
    
}
