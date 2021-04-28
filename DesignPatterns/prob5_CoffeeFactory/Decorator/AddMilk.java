package prob5_CoffeeFactory.Decorator;

import prob5_CoffeeFactory.CoffeeFactory.*;

public class AddMilk implements Command{
    
    Command command;
    
    public AddMilk(Command command){
        this.command = command;
    }
    
    public void execute(){}
    
    public String getCoffee(){
        return "AddMilk...\n" + command.getCoffee();
    }
    
}
