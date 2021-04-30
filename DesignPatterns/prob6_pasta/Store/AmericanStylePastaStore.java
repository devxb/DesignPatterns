package prob6_pasta.Store;

import prob6_pasta.Pasta.*;
import prob6_pasta.Pasta.Ingredients.*;

public class AmericanStylePastaStore extends PastaStore{
    
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
        pasta = new Cheese(pasta); // AmericanStylePasta의 경우 항상 치즈가 추가로 한번 더 들어감 따라서, 마지막에 치즈 데코레이터로 감싸주면됨
        return pasta;
    }
    
}
