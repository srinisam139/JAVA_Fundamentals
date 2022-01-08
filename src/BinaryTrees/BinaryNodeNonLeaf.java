package BinaryTrees;

public class BinaryNodeNonLeaf {
    public static void main(String[] args) {
        BinaryNode<Integer> b5 = new BinaryNode<>(39,null,null);
        b5.binaryInsert(25,b5);
        b5.binaryInsert(136,b5);
        b5.binaryInsert(8,b5);
        b5.binaryInsert(26,b5);
        b5.binaryInsert(93,b5);
        b5.binaryInsert(196,b5);
        b5.binaryInsert(198,b5);
        int result=b5.leaves(b5);
        System.out.println("Checking the count of null leaf nodes: "+result);

        BinaryNode<Integer> b6 = new BinaryNode<>(39,null,null);
        b6.binaryInsert(25,b6);
        b6.binaryInsert(136,b6);
        b6.binaryInsert(8,b6);
        b6.binaryInsert(26,b6);

        result=b6.leaves(b6);
        System.out.println("Checking the count of null leaf nodes: "+result);
    }

}
