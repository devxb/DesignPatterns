package prob9_JavaTree.Nodes;

import prob9_JavaTree.*;

public class Leaf implements Tree{
    
    private int numberOfLeaf;
    
    public void addNode(Tree tree){}
    
    public Leaf(int numberOfLeaf){
        this.numberOfLeaf = numberOfLeaf;
    }
    
    public int eatLeaf(){
        return numberOfLeaf;
    }
    
    public int getLeaf(){
        return eatLeaf();
    }
    
    public Tree getNode(int nodeName){
        return null;
    }
    
}
