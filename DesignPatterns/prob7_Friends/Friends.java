package prob7_Friends;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Friends implements Comparable<Friends>{
    
    private String name;
    private int solvedProb;
    private double exp;
    
    public Friends(){
        input(); // 친구들을 만들때 정보를 입력받는다.
    }
    
    private void input(){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String info = br.readLine();
            String[] o = info.split(" ");
            this.name = o[0];
            this.solvedProb = Integer.parseInt(o[1]);
            this.exp = Double.parseDouble(o[2]);
        }catch(IOException IOE){
            System.exit(1);
        }
    }
    
    public String getName(){return this.name;}
    public int getSolvedProb(){return this.solvedProb;}
    public double getExp(){return this.exp;}
    public String get(){
        return getName() + " " + getSolvedProb() + " " + getExp();
    }
    
    @Override
    public int compareTo(Friends F){
        if(this.solvedProb > F.getSolvedProb()) return 1;
        if(this.solvedProb < F.getSolvedProb()) return -1;
        if(this.solvedProb == F.getSolvedProb()){
            if(this.exp > F.getExp()) return 1;
            else if(this.exp < F.getExp()) return -1;
        }
        return 0;
    }
}
