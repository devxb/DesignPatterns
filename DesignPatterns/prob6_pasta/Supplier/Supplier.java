package prob6_pasta.Supplier;

import java.util.ArrayList;
import prob6_pasta.Pasta.Ingredients.*;
import java.util.Scanner;

public class Supplier implements Subject{
    private int costTomatoSauce;
    private int costPastaNoodles;
    private int costOliveOil;
    private int costHurb;
    private int costCheese;
    private Scanner sc;
    // 재료들의 가격을 외부에서 접근하면 안되므로 private로 선언한다.
    private static Supplier supplier; // 싱글톤 객체인 Supplier
    private ArrayList<Observer> ingredients = new ArrayList<Observer>(); // Observer을 등록하고 관리하는 ArrayList
    // 재료들의 가격을 외부에서 접근하면 안되므로 private로 선언한다.
    private Supplier(){
        this.sc = new Scanner(System.in);
    }
    
    public static Supplier getInstance(){
        if(supplier == null) supplier = new Supplier();
        return supplier;
        // static으로 만듦으로써 구상 인스턴스 없이도 getInstance는 선언가능하다. (싱글톤 패턴)
    }
    
    public void updatePrice(){ // 가격 바꾸는 메소드
        this.costTomatoSauce = sc.nextInt();
        this.costPastaNoodles = sc.nextInt();
        this.costOliveOil = sc.nextInt();
        this.costHurb = sc.nextInt();
        this.costCheese = sc.nextInt();
        notice();
    }
    
    public void notice(){ // 등록된 옵저버들 (재료들)에게 가격 변동을 알리는 메소드
        for(int i = 0; i < ingredients.size(); i++){
            Observer ingredient = ingredients.get(i);
            ingredient.get(this.costTomatoSauce, this.costPastaNoodles, this.costOliveOil, this.costHurb, this.costCheese);
        }
    }
    
    public void addObserver(Observer ingredient){ // 재료들을 등록하는 메소드
        this.ingredients.add(ingredient);
    }
}
