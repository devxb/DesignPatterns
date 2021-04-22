package notebook.notebooks;

import notebook.Super.*;

public class Gram implements notebook{
    private String name;
    private int price;
    
    public Gram(){
        this.name = "Gram";
        this.price = 1200;
    }
    
    public boolean getOS(){
        return false;
    }
    
    public int getPrice(){
        return this.price;
    }
    
    public String getOptions(){
        return this.name;
    }
    
}
