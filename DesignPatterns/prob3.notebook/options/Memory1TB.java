package notebook.options;

import notebook.Super.*;

public class Memory1TB extends mainOption{
    
    public Memory1TB(notebook Notebook){
        this.Notebook = Notebook;
        this.option = ", 1TBMemory";
    }
    
    @Override
    public int getPrice(){
        int ret = 0;
        if(Notebook.getOS()) ret = 900;
        else ret =  250;
        return ret + Notebook.getPrice();
    }
    
}
