package Practicum_2;

import javax.sound.midi.Soundbank;
import java.util.LinkedList;
import java.util.Objects;


public class Question2 {
    public static void union(LinkedList<String> list1, LinkedList<String> list2) {
        LinkedList<String> list3 = new LinkedList<>();
        list3.addAll(list1);
        list3.addAll(list2);
        for(int i=0;i<list3.size();i++){
            System.out.println(list3.get(i));
        }
    }

    public static void difference(LinkedList<String> list1, LinkedList<String> list2) {
        LinkedList<String> list4 = new LinkedList<>();
        for (int i = 0; i < list2.size(); i++) {
            if (Objects.equals(list1.get(i), list2.get(i))) {
                System.out.println();
            } else {
                System.out.println("The difference is"+list1.get(i)+list2.get(i));
            }
            System.out.println("The difference is"+list1.get(5));

        }
    }
        public static void Intersection (LinkedList < String > list1, LinkedList < String > list2){
            //LinkedList<String> list5 = new LinkedList<>();
            for (int i = 0; i < list2.size(); i++) {
                if (Objects.equals(list1.get(i), list2.get(i))) {
                    System.out.println(list1.get(i));
                }
            }
        }
        public static void main (String[]args){
            LinkedList<String> list1 = new LinkedList<>();
            list1.add("George");
            list1.add("Jim");
            list1.add("John");
            list1.add("Blake");
            list1.add("Kevin");
            list1.add("Michael");
            LinkedList<String> list2 = new LinkedList<>();
            list2.add("George");
            list2.add("Katie");
            list2.add("Kevin");
            list2.add("Michelle");
            list2.add("Ryan");
            union(list1,list2);
            Intersection(list1,list2);
            difference(list1,list2);
        }

    }
