package prob6_pasta.Pasta.Ingredients;

import prob6_pasta.Pasta.*;

public class TomatoSauce implements PastaPrepare, Observer{
    
    private PastaPrepare pasta;
    
    private static int TomatoSauceCost;
    
    public TomatoSauce(){}
    
    public TomatoSauce(PastaPrepare pasta){
        this.pasta = pasta;
    }
    
    public int cost(){
        return this.pasta.cost() + TomatoSauceCost;
    }
    
    public void get(int tomato, int pasta, int oil, int hurb, int cheese){
        TomatoSauceCost = tomato;
    }
    
}
