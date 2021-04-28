package prob5_CoffeeFactory.Decorator;

import prob5_CoffeeFactory.CoffeeFactory.*;

public class AddIce implements Command{
    
    Command command;
    
    public AddIce(Command command){
        this.command = command;
    }
    
    public void execute(){}
    
    public String getCoffee(){
        return "AddIce...\n" + command.getCoffee();
    }
    
}
