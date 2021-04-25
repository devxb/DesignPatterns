package prob4_pasta.Store;

import prob4_pasta.Pasta.*;

public abstract class PastaStore {
    
    PastaPrepare pasta;
    
    protected abstract PastaPrepare createPasta(String menu);
    
    public void orderPasta(String menu){
        
        this.pasta = createPasta(menu);
        System.out.println(pasta.cost());
    }
    
}
