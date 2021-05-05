package prob10_CoffeeMachine;

import prob10_CoffeeMachine.Coffee.*;

public class CoffeeMachine {
    
    private CoffeeMachineState state;
    private Drip drip;
    
    public CoffeeMachine(){
        state = new CleanState(this);
        drip = new Americano();
    }
    
    public void setState(CoffeeMachineState state){
        this.state = state;
    }
    
    public void changeCoffee(Drip drip){
        if(drip.getClass() == this.drip.getClass()) return;
        this.drip = drip;
        setState(new DirtyState(this));
    }
    
    public void drip(){
        if(this.state.drip()) drip.drip(); // 깨끗하다면 추출한다
        else this.state.cleaner(); // 더럽다면 닦는다.
    }
    
}
