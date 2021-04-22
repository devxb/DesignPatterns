package notebook.options;

import notebook.Super.*;

public class Memory512GB extends mainOption{
    
    public Memory512GB(notebook Notebook){
        this.Notebook = Notebook;
        this.option = ", 512Memory";
    }
    
    @Override
    public int getPrice(){
        int ret = 0;
        if(Notebook.getOS()) ret = 450;
        else ret = 150;
        return ret + Notebook.getPrice();
    }
}
