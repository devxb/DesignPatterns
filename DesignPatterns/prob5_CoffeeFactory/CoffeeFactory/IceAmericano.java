package prob5_CoffeeFactory.CoffeeFactory;

import prob5_CoffeeFactory.Decorator.*;

public class IceAmericano implements Command{
    
    private Command command;
    
    public String getCoffee(){
        return "IceAmericano!";
    }
    
    public void execute(){
        command = new AddWater(new AddEspresso(new GrindBeans(new AddIce(this))));
        System.out.println(command.getCoffee());
    }
    
}
