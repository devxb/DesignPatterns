package prob9_JavaTree;

public interface Tree {
    void addNode(Tree tree);
    int eatLeaf();
    int getLeaf();
    Tree getNode(int nodeName);
}
