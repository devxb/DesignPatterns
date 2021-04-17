package Cafe24;

public class coffeeMachine {
    makeCoffee coffee;
    
    public void setCoffeeType(makeCoffee cf){
        this.coffee = cf;
    }
    
    public void dripCoffee(){
        coffee.drip();
    }
    
}

