package prob5_CoffeeFactory.CoffeeFactory;

import prob5_CoffeeFactory.Decorator.*;

public class Espresso implements Command{
    
    private Command command;
    
    public String getCoffee(){
        return "Espresso!";
    }
    
    public void execute(){
        command = new AddEspresso(new GrindBeans(this));
        System.out.println(command.getCoffee());
    }
    
}
