package prob6_pasta.Adapter;

import prob6_pasta.Restaurants.*;
import prob6_pasta.Store.*;

public class PastaToRestaurants implements Restaurants{
    
    private PastaStore pastaStore;
    
    public PastaToRestaurants(PastaStore pastaStore){
        this.pastaStore = pastaStore;
    }
    
    public void order(String menu){
        makeFood(menu);
    }
    
    public void makeFood(String menu){
        this.pastaStore.orderPasta(menu);
    }
    
}
