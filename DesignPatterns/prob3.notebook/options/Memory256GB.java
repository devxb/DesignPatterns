package notebook.options;

import notebook.Super.*;

public class Memory256GB extends mainOption{
    
    public Memory256GB(notebook Notebook){
        this.Notebook = Notebook;
        this.option = ", 256Memory";
    }
    
    @Override
    public int getPrice(){
        int ret = 0;
        if(Notebook.getOS()) ret = 250;
        else ret = 100;
        return ret + Notebook.getPrice();
    }
    
}
