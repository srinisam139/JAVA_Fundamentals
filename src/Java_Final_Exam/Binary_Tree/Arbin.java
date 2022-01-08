package Java_Final_Exam.Binary_Tree;

public interface Arbin {
    int content (Arb values);
    boolean existsLeftChild (Arb node);
    boolean existsRightChild (Arb node);
    Arbin leftChild (Arb child1);
    Arbin rightChild (Arb child2);
    void setContent (int c);
    void createLeftChild (Arb B1);
    void createRightChild (Arb B2);
    int height (Arb height);
    void calculateValues(Arb leaves);
}
