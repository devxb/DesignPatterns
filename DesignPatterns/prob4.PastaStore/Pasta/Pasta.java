package prob4_pasta.Pasta;

public class Pasta implements PastaPrepare{
    
    private int cost;
    private String pastaMenu;
    
    public Pasta(int cost, String Menu){
        this.cost = cost;
        this.pastaMenu = Menu;
    }
    
    public int cost(){
        System.out.print(this.pastaMenu + " $"); 
        // 데코레이션 패턴에서 재귀로 cost를 더하며 들어올때, 마지막에 위치하는 Pasta클래스 까지 들어온시점에, pastaMenu를 호출한다. 
        //이렇게 구현한 이유는, PastaPrepare에 메뉴 이름을 리턴하는 메소드가 없기때문이다.(다형성 사용못함)
        return this.cost;
    }
    
}
