package prob4_pasta.Pasta.Ingredients;

import prob4_pasta.Pasta.*;

public class Hurb implements PastaPrepare, Observer{
    
    private PastaPrepare pasta;
    
    private static int HurbCost;
    
    public Hurb(){}
    
    public Hurb(PastaPrepare pasta){
        this.pasta = pasta;
    }
    
    public int cost(){
        return this.pasta.cost() + HurbCost;
    }
    
    public void get(int tomato, int pasta, int oil, int hurb, int cheese){
        HurbCost = hurb;
    }
    
}
