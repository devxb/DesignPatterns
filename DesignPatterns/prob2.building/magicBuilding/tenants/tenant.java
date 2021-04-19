package magicBuilding.tenants;

import java.util.ArrayList;
import magicBuilding.*;

public class tenant implements observer, tenantBehavior{
    
    private int myRent;
    private String myRoom;
    private int myDownPayment;
    private ArrayList<String> myOptions = new ArrayList<String>();
    building Building;
    // 세입자의 정보 -> 집주인말고는 알면안됨 -> private

    public tenant(subject Building, int downPayment, String Room){ // 계약하기, downPayment, 방 이름
        this.myDownPayment = downPayment;
        this.myRoom = Room;
        this.myRent = 20; // 월세는 항상 20으로 고정하자.
        this.myOptions.add("");
        Building.addTenant(this);
        this.Building = (building)Building;
    }
    
    public void update(int rent, String options){ // update호출 받으면 자신의 월세, 옵션들을 추가함
        this.myRent += rent;
        if(!options.equals("")) myOptions.add(options);
    }
    
    public void behavior(){ // 집주인이 call하면 자신의 계약 정보를 부르자
        System.out.println("Hi! myRoom : " + speakRoom() + ", myRent : " + String.valueOf(speakRent()) + ", myDownPayment : " + String.valueOf(speakDownPayment()) + " and myOptions : " + speakOptions());
    }
    
    public String speakRoom(){ // 호실 말하기
        return myRoom;
    }
    
    public int speakRent(){ // 월세 말하기
        return myRent;
    }
    
    public int speakDownPayment(){ // 계약금 말하기
        return myDownPayment;
    }
    
    public String speakOptions(){ // 현재 옵션들 말하기
        String ret = "{";
        int size = myOptions.size();
        for(int i = 0; i < size; i++){
            ret += myOptions.get(i);
            if(i > 0 && i < size-1) ret += ", ";
        }
        ret += "}";
        return ret;
    }
    
    public boolean cancel(String Room){
        return myRoom.equals(Room); 
    }
    
}
