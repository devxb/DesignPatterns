package prob9_JavaTree;

import java.io.*;
import prob9_JavaTree.Nodes.*;

public class Root {
    
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private Tree rootOfTree = new BranchWithArrayList(0);
    
    public void run(){ // 실행을 담당하는 메소드이다. run메소드를 호출하면 답이나온다.
        input();
        System.out.println(rootOfTree.getLeaf());
    }
    
    private void input(){ // 입력을 담당하는 메소드이다.
        try{
            int input[] = new int[5];
            String[] temp = br.readLine().split(" ");
            while(!temp[0].equals("-")){
                for(int i = 0; i < 3; i++) input[i] = Integer.parseInt(temp[i]);
                Tree tree = smallFactory(input[2], input[1]); // 입력값에 따라 나뭇가지노드 혹은 나뭇잎노드를 생성한다.
                Tree par = rootOfTree.getNode(input[0]); // 나뭇잎 노드가 저장될 노드를 찾는다. Root노드의 이름은 항상 0이다.
                if(par == null) continue; // 찾은 노드가 나뭇잎이라면 저장하지않고 위로올린다.
                par.addNode(tree);
                temp = br.readLine().split(" ");
            }
        } catch (IOException ioe){}
    }
    
    private Tree smallFactory(int state, int nodeName){ // 생성을 담당하는 메소드이다.
        Tree ret = null;
        if(state == 1) ret = new Leaf(nodeName); // 나뭇잎을 만든다.
        else if(state == 2) ret = new BranchWithArrayList(nodeName); // 나뭇가지를 만든다. 이때 이름을 입력받은 nodeName으로 한다.
        return ret;
    }
    
}