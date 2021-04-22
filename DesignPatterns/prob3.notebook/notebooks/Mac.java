package notebook.notebooks;

import notebook.Super.*;

public class Mac implements notebook{
    private String name;
    private int price;
    
    public Mac(){
        this.name = "Mac";
        this.price = 1500;
    }
    
    public boolean getOS(){
        return true;
    }
    
    public int getPrice(){
        return this.price;
    }
    
    public String getOptions(){
        return this.name;
    }
    
}
