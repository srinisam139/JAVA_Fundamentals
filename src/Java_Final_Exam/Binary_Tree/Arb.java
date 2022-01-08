package Java_Final_Exam.Binary_Tree;

import java.util.Random;
import java.util.Scanner;

public class Arb<E> implements Arbin{


    private static final Random RNG2 = new Random(5);
    private int value;
    private Arb<E> left;
    private Arb<E> right;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Arb<E> getLeft() {
        return left;
    }

    public void setLeft(Arb<E> left) {
        this.left = left;
    }

    public Arb<E> getRight() {
        return right;
    }

    public void setRight(Arb<E> right) {
        this.right = right;
    }

    public Arb(int value) {
        this.value = value;
    }

    public Arb(int value, Arb<E> left, Arb<E> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    @Override
    public int content(Arb leaves) {
        return leaves.getValue();
    }

    @Override
    public boolean existsLeftChild(Arb left_child) {
        return left_child.getLeft() != null;
    }

    public void infixTraversal(Visitor visitor, Arb<Integer> b1) {
        if (b1 != null) {
            infixTraversal(visitor, b1.left);
            visitor.visit(b1);
            infixTraversal(visitor, b1.right);
        }
    }

    @Override
    public boolean existsRightChild(Arb right_child) {
        return right_child.getRight() != null;
    }

    @Override
    public Arbin leftChild(Arb left_child) {
        if(left_child != null)
            left_child =  left_child.getLeft();
        return left_child;
    }

    @Override
    public Arbin rightChild(Arb right_child) {
        if(right_child != null)
            right_child =  right_child.getRight();
        return right_child;
    }

    @Override
    public void setContent(int c) {
        setValue(c);
    }

    @Override
    public void createLeftChild(Arb B1) {
        if (B1.left != null) {
            Arbin_CreateNode(value, B1.left);
        } else {
            B1.setLeft(new Arb<>(value, null, null));
        }
    }

    @Override
    public void createRightChild(Arb B2) {
        if (B2.left != null) {
            Arbin_CreateNode(value, B2.left);
        } else {
            B2.setLeft(new Arb<>(value, null, null));
        }
    }

    @Override
    public int height(Arb node) {
        int left = 1;
        int right = 1;

        if (node.getLeft() != null) {
            left = left + height(node.getLeft());
        }
        if (node.getRight() != null) {
            right = right + height(node.getRight());
        }
        return Math.max(left, right);
    }

    @Override
    public void calculateValues(Arb leaves) {
        if (leaves.left == null && leaves.right == null) {
            leaves.setContent((int)Math.floor(Math.random()*(10-1+1)+1));
        } else {
            if(leaves.left == null){
                leaves.setContent(leaves.getRight().getValue());
            }
            else if(leaves.right == null){
                leaves.setContent(leaves.left.getValue());
            } else {
                leaves.setContent(leaves.getRight().getValue()+leaves.left.getValue());
            }
        }
    }

    public void Arbin_CreateNode(int value, Arb<E> B1) {
        if (B1.getValue() < value) {
                if (B1.right != null) {
                    Arbin_CreateNode(value, B1.right);
                } else {
                    B1.setRight(new Arb<>(value, null, null));
                }
            } else {
                if (B1.left != null) {
                    Arbin_CreateNode(value, B1.left);
                } else {
                    B1.setLeft(new Arb<>(value, null, null));
                }
            }

    }

    public boolean Compare(Object n1) {

        Arb<?> node = (Arb) n1;
        boolean result = false;

        if(this.value == node.value){
            result = true;
        }

        if(result) {
            if ((node.left != null && this.left != null)) {
                result = this.left.equals(node.left);
            } else if (node.left != null && this.left == null) {
                result = false;
            } else if (node.left == null && this.left != null) {
                result = false;
            }

            if (node.right != null && this.right != null) {
                result = this.right.equals(node.right);
            } else if (node.right != null && this.right == null) {
                result = false;
            } else if (node.right == null && this.right != null) {
                result = false;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Arb<Integer> b1 = new Arb<>(39, null, null);
        int min =0;
        int max =100;
        for(int i=0;i<20;i++){
            b1.Arbin_CreateNode((int)Math.floor(Math.random()*(max-min+1)+min),b1);
        }
        System.out.println("Displaying the binary nodes");
        StringifyVisitor str = new StringifyVisitor();
        b1.infixTraversal(str, b1);
        System.out.println(str);
        System.out.println("Calling calculate function: ");
        b1.calculateValues(b1.getRight().getRight());
        System.out.println(b1.getLeft().getValue());
    }
}
