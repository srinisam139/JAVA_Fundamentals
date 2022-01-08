package RecursionAndBinarySearch.homework05;
 public class FindTheError {
      public static void main(String [] args) {
          myMethod(0);
      }
      public static void myMethod(int num){
          System.out.println(num + " ");
         myMethod(num+1);}
  }

/**Answer:
 * The above program code results in stack overflow, because there is no base case to stop the calling function
 * inside the function,which result in never ending recursion. Need to add an if case or a condition inorder to
 *  avoid stack overflow.
 * */




