package notebook.options;

import notebook.Super.*;

public class Corei5 extends mainOption{
    
    public Corei5(notebook Notebook){
        this.Notebook = Notebook;
        this.option = ", Core-i5 ";
    }
    
    @Override
    public int getPrice(){
        int ret = 0;
        if(Notebook.getOS()) ret = 250;
        else ret =  200;
        return ret + Notebook.getPrice();
    }
    
}
