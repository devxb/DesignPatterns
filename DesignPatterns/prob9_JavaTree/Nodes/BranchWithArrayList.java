package prob9_JavaTree.Nodes;

import java.util.ArrayList;
import prob9_JavaTree.*;

public class BranchWithArrayList implements Tree{
    private int nodeName;
    private ArrayList<Tree> nodes = new ArrayList<Tree>(); 
    // 여기에 나뭇잎과 나뭇가지가 저장될것이다.
    // 나뭇잎, 나뭇가지는모두 Tree인터페이스를 구현할것이다.
    
    public BranchWithArrayList(int nodeName){
        this.nodeName = nodeName;
    }
    
    public Tree getNode(int nodeName){ // 모든자식들을 반복하며 원하는 노드를 갖고있는 Leaf를 찾는다.
        if(nodeName == this.nodeName) return this;
        Tree ret = null;
        for(int idx = 0; idx < nodes.size(); idx++) {
            Tree temp = nodes.get(idx).getNode(nodeName);
            if(temp == null) continue;
            ret = temp;
        }
        return ret;
    }
    
    public void addNode(Tree tree){
        this.nodes.add(tree);
    }
    
    public int eatLeaf(){
        return 0; // 나뭇가지라서 나뭇잎을 먹을수없음
    }
    
    public int getLeaf(){
        int ret = 0;
        for(int idx = 0; idx < nodes.size(); idx++){
            ret = Math.max(nodes.get(idx).getLeaf(), ret);
        }
        return ret;
    }
}
