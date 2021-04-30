package prob6_pasta.Simulator;

import prob6_pasta.Pasta.*;
import prob6_pasta.Pasta.Ingredients.*;
import prob6_pasta.Store.*;
import prob6_pasta.Supplier.*;
import prob6_pasta.Restaurants.*;
import prob6_pasta.Adapter.*;
import java.util.Scanner;

public class Simulator {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        // START supplier와 재료들 새팅
        Supplier supplier = Supplier.getInstance();
        supplier.addObserver(new Cheese());
        supplier.addObserver(new PastaNoodles());
        supplier.addObserver(new OliveOil());
        supplier.addObserver(new TomatoSauce());
        supplier.addObserver(new Hurb());
        // END supplier와 재료들 세팅 
        
         // 초기 모든 재료의 가격은 $0임
        int N = sc.nextInt();
        for(int i = 0; i < N; i++){
            String store = sc.next();
            Restaurants restaurants;
            if(store.equals("AmericanPasta")) restaurants = new PastaToRestaurants(new AmericanStylePastaStore());
            else if(store.equals("ItalianPasta")) restaurants = new PastaToRestaurants(new ItalianStylePastaStore());
            else{
                System.out.println("없는 가게입니다!");
                continue;
            }
            supplier.updatePrice();
            String menu = sc.next();
            restaurants.order(menu);
        }
    }
    
    
    
}
