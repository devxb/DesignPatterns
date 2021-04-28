package prob5_CoffeeFactory.Decorator;

import prob5_CoffeeFactory.CoffeeFactory.*;

public class AddEspresso implements Command{
    
    Command command;
    
    public AddEspresso(Command command){
        this.command = command;
    }
    
    public void execute(){}
    
    public String getCoffee(){
        return "AddEspresso...\n" + command.getCoffee();
    }
    
}
