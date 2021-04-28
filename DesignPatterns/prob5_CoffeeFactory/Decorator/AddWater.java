package prob5_CoffeeFactory.Decorator;

import prob5_CoffeeFactory.CoffeeFactory.*;

public class AddWater implements Command{
    
    Command command;
    
    public AddWater(Command command){
        this.command = command;
    }
    
    public void execute(){}
    
    public String getCoffee(){
        return "AddWater...\n" + command.getCoffee();
    }
    
}
