package notebook.simulator;

import notebook.Super.*;
import notebook.notebooks.*;
import notebook.options.*;
import java.util.Scanner;

public class simul {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        notebook Notebook;
        String myNotebook = sc.next();
        if(myNotebook.equals("Mac")) Notebook = new Mac();
        else if(myNotebook.equals("Gram")) Notebook = new Gram();
        else if(myNotebook.equals("Surf")) Notebook = new Surf();
        else{
            System.out.println("없는 노트북 입니다.");
            return;
        }
        int unt = sc.nextInt();
        for(int i = 0; i < unt; i++){
            String option = sc.next();
            if(option.equals("Corei5")) Notebook = new Corei5(Notebook);
            if(option.equals("Memory256GB")) Notebook = new Memory256GB(Notebook);
            if(option.equals("Memory512GB")) Notebook = new Memory512GB(Notebook);
            if(option.equals("Memory1TB")) Notebook = new Memory1TB(Notebook);
        }
        System.out.println("$" + Notebook.getPrice() + " " + Notebook.getOptions());
    }
}
