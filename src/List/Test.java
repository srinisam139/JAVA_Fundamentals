package List;

import java.util.ArrayList;

public class Test<T> {

    public static< E > void printarray(E[] printarray){
        for(E element :printarray){
            System.out.println(element.getClass().getName());
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        printarray(intArray);
        printarray(doubleArray);
        printarray(charArray);

    }
}
