package prob10_CoffeeMachine;

public class CleanState implements CoffeeMachineState{

    private CoffeeMachine coffeeMachine;
    
    public CleanState(CoffeeMachine coffeeMachine){
        this.coffeeMachine = coffeeMachine;
    }
    
    public void cleaner(){
        System.out.println("커피머신이 이미 깨끗합니다."); // 커피머신이 깨끗한 상태에서는 닦을필요가없다.
    }
    
    public boolean drip(){
        return true; // 커피머신이 깨끗하므로, drip을 허용한다.
    }
    
}
