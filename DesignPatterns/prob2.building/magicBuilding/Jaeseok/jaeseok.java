package magicBuilding.Jaeseok;

import java.util.ArrayList;
import magicBuilding.*;

public class jaeseok implements JaeseokBehavior{
    
    private building myBuilding;
    private int rent;
    private ArrayList<String> options = new ArrayList<String>();
    // 위 변수들은 중요한거임. 다른사람(세입자)이 접근하면안됨 -> private
    
    public jaeseok(building building){
        myBuilding = building;
    }
    
    public void addOption(String newOption){ // 재석이가 할일 - 옵션 추가하기
        options.add(newOption);
        myBuilding.changeOption(options.get(options.size()-1));
    }
    
    public void increaseRent(int increase){ // 재석이가 할일 - 집세 올리기
        myBuilding.changeRent(increase);
    }
    
}
