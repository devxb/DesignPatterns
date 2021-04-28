package prob5_CoffeeFactory.CoffeeFactory;

import prob5_CoffeeFactory.Decorator.*;

public class CaffeLatte implements Command{
    
    Command command;
    
    public String getCoffee(){
        return "CaffeLatte!";
    }
    
    public void execute(){
        command = new AddEspresso(new GrindBeans(new AddMilk(new AddWater(this))));
        System.out.println(command.getCoffee());
    }
    
}
