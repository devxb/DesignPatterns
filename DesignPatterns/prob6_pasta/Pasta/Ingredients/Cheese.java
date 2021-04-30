package prob6_pasta.Pasta.Ingredients;

import prob6_pasta.Pasta.*;

public class Cheese implements PastaPrepare, Observer{
    
    private PastaPrepare pasta;
    
    private static int CheeseCost;
    
    public Cheese(){}
    
    public Cheese(PastaPrepare pasta){
        this.pasta = pasta;
    }
    
    public int cost(){
        return this.pasta.cost() + CheeseCost;
    }
    
    public void get(int tomato, int pasta, int oil, int hurb, int cheese){
        CheeseCost = cheese;
    }
    
}
