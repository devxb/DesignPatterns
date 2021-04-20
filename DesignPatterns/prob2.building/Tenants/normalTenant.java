package magicBuilding.Tenants;

import java.util.ArrayList;
import magicBuilding.Building.*;

public class normalTenant implements observer, tenantBehavior{
    
    private int monthly;
    private String room;
    private ArrayList<String> options = new ArrayList<String>();
    
    public normalTenant(subject Building, int monthly, String room){
        this.monthly = monthly;
        this.room = room;
        Building.addObserver(this);
    }
    
    public void update(String option, int monthly){
        this.monthly += monthly;
        if(!option.equals("")) options.add(option);
    }
    
    public void call(){
        System.out.print("Hello! " + speakRoom() + speakMonthly() + speakOptions());
    }
    
    public String speakRoom(){
        return "my Room : " + room + "\n";
    }
    
    public String speakMonthly(){
        return "my Monthly : " + String.valueOf(monthly) + "\n";
    }
    
    public String speakOptions(){
        String ret = "my Options : \n";
        int size = options.size();
        for(int i = 0; i < size; i++){
            ret += "-" + options.get(i);
            if(i < size) ret += "\n";
        }
        return ret;
    }
    
}
