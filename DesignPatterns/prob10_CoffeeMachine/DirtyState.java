package prob10_CoffeeMachine;

public class DirtyState implements CoffeeMachineState{
    
    private CoffeeMachine coffeeMachine;
    
    public DirtyState(CoffeeMachine coffeeMachine){
        this.coffeeMachine = coffeeMachine;
    }
    
    public void cleaner(){
        System.out.println("커피머신을 닦는중입니다..!");
        coffeeMachine.setState(new CleanState(this.coffeeMachine)); // coffeMachine의 상태를 Clean으로 변경한다.
    }
    
    public boolean drip(){
        System.out.println("커피머신이 더럽습니다..!"); // 더러운 상태에서는 커피를 만들수없다.
        return false;
    }
    
}
