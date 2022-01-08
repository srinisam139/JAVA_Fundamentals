package RecursionAndBinarySearch.homework05;

public class Characters {

    public static void main(String[] args) {
        char[] JavaCharArray = {'a', 'b', 'c', 'd', 'e', 'e', 'a', 'b', 'e'};//character array declaration
        int end = JavaCharArray.length - 1;
        char target = 'e';//Target variable
        int count = call(JavaCharArray, end, target);// function call
        System.out.println("The count of the character "+"'"+target+"'"+" in the array is "+count);
    }
/**
 * The below function performs recursion to calculate the count of the value from the array value passed.
 *'if' case will be the base case here.
 * After that, there is ana another 'if' case to check the array value is equal to the target value and count is increased if it equals.
 * End value is passed here to keep track of the array
 * It is decreased each time till the index zero
 * after exiting the base case, the value stored in the local variable is passed to Graph.main
 * */
    public static int call(char[] arr, int end, char target) {
        int result=0;
        if (end > 0) {
            if (arr[end] == target) {
                result++;
            }
            end -= 1;
            result=result+call(arr, end, target);
            return result;
        }
        return result;
    }
}
