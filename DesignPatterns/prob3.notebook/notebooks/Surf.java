package notebook.notebooks;

import notebook.Super.*;

public class Surf implements notebook{
    private String name;
    private int price;
    
    public Surf(){
        this.name = "Surf";
        this.price = 1100;
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
