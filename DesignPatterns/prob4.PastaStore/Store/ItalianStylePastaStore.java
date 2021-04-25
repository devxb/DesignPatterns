package prob4_pasta.Store;

import prob4_pasta.Pasta.*;
import prob4_pasta.Pasta.Ingredients.*;

public class ItalianStylePastaStore extends PastaStore{
    
    protected PastaPrepare createPasta(String menu){
        if(menu.equals("CheeseOvenPasta")){
            pasta = new Pasta(10, menu);
            pasta = new Cheese(pasta);
            pasta = new PastaNoodles(pasta);
            pasta = new TomatoSauce(pasta);
        }
        else if(menu.equals("RosePasta")){
            pasta = new Pasta(13, menu);
            pasta = new PastaNoodles(pasta);
            pasta = new TomatoSauce(pasta);
        }
        else if(menu.equals("AglioOlioPasta")){
            pasta = new Pasta(15, menu);
            pasta = new PastaNoodles(pasta);
            pasta = new Hurb(pasta);
            pasta = new OliveOil(pasta);
        }
        return pasta;
    }
    
}
