package prob6_pasta.Store;

import prob6_pasta.Pasta.*;

public abstract class PastaStore {
    
    PastaPrepare pasta;
    
    protected abstract PastaPrepare createPasta(String menu);
    
    public void orderPasta(String menu){
        
        this.pasta = createPasta(menu);
        System.out.println(pasta.cost());
    }
    
}
