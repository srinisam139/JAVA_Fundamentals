package Practicum_2;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Stack;

public class Question3 {

    public static void method(LinkedList<String> list){
        Stack<String> stack = new Stack<>();
        stack.addAll(list);
        int result=0;
        for(int i=0;i<stack.size();i++){
            for(int j=stack.size()-1;j>0;j--){
                if(Objects.equals(stack.get(i), stack.get(j))){
                    result+=1;
                }
            }
            }
        if(stack.size()/result==1){
            System.out.println("It is a Palindrome");
        }
    }
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("George");
        list1.add("Jim");
        list1.add("John");
        list1.add("jim");
        list1.add("George");
        method(list1);
    }
}
