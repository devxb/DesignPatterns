package prob10_CoffeeMachine;

public interface CoffeeMachineState {
    public void cleaner(); // 커피머신을 세척하는 메소드이다.
    public boolean drip(); // 커피머신의 상태를 주관하는 클래스가 커피추출에 영향을 미칠것이다.
}
