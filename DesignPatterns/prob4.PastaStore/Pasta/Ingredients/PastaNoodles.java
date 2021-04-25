package prob4_pasta.Pasta.Ingredients;

import prob4_pasta.Pasta.*;

public class PastaNoodles implements PastaPrepare, Observer{
    
    private PastaPrepare pasta;
    
    private static int PastaNoodlesCost;
    
    public PastaNoodles(){}
    
    public PastaNoodles(PastaPrepare pasta){
        this.pasta = pasta;
    }
    
    public int cost(){
        return this.pasta.cost() + PastaNoodlesCost;
    }
    
    public void get(int tomato, int pasta, int oil, int hurb, int cheese){
        PastaNoodlesCost = pasta;
    }
    
}
