package notebook.options;

import notebook.Super.*;

public class mainOption implements notebook{
    protected int price;
    protected String option;
    protected notebook Notebook;
    
    public boolean getOS(){
        return Notebook.getOS();
    }
    
    public int getPrice(){
        return this.price + Notebook.getPrice();
    }
    
    public String getOptions(){
        return Notebook.getOptions() + this.option;
    }
    
}
