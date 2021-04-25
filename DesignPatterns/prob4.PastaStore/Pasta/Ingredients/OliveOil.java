package prob4_pasta.Pasta.Ingredients;

import prob4_pasta.Pasta.*;

public class OliveOil implements PastaPrepare, Observer{
    
    private PastaPrepare pasta;
    
    private static int OliveOilCost;
    
    public OliveOil(){}
    
    public OliveOil(PastaPrepare pasta){
        this.pasta = pasta;
    }
    
    public int cost(){
        return this.pasta.cost() + OliveOilCost;
    }
    
    public void get(int tomato, int pasta, int oil, int hurb, int cheese){
        OliveOilCost = oil;
    }
    
}

