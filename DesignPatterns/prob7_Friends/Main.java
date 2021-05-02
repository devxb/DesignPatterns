package prob7_Friends;

import prob7_Friends.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            ArrayList<Friends> friendList = new ArrayList<Friends>();
            int n = Integer.parseInt(br.readLine());
            for(int i = 0; i < n; i++){
                friendList.add(new Friends());
            }
            Collections.sort(friendList);
            for(int i = 0; i < friendList.size(); i++) System.out.println(friendList.get(i).get());
        }
        catch(IOException IOE){
            System.exit(1);
        }
    }
    
}
