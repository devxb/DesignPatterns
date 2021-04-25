package prob4_pasta.Simulator;

import prob4_pasta.Pasta.*;
import prob4_pasta.Pasta.Ingredients.*;
import prob4_pasta.Store.*;
import prob4_pasta.Supplier.*;
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
            PastaStore pastaStore;
            if(store.equals("AmericanPasta")) pastaStore = new AmericanStylePastaStore();
            else if(store.equals("ItalianPasta")) pastaStore = new ItalianStylePastaStore();
            else{
                System.out.println("없는 가게입니다!");
                continue;
            }
            supplier.updatePrice();
            String menu = sc.next();
            pastaStore.orderPasta(menu);
        }
    }
    
    
    
}
