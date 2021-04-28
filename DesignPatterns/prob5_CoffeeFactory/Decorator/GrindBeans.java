package prob5_CoffeeFactory.Decorator;

import prob5_CoffeeFactory.CoffeeFactory.*;

public class GrindBeans implements Command{
    
    private Command command;
    
    public GrindBeans(Command command){
        this.command = command;
    }
    
    public void execute(){}
    
    public String getCoffee(){
        return "GrindBeans...\n" + command.getCoffee();
    }
    
}
