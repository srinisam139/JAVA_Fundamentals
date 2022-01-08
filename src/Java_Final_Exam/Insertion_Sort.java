package Java_Final_Exam;

public class Insertion_Sort {

    public static int[] two_sort(int[] a) throws NullPointerException{
        try {
            int[] result = new int[a.length];
            int j;
            int temp;
            System.arraycopy(a, 0, result, 0, a.length);
            for(int i=0;i<result.length;i++){
                temp = result[i];
                j = i-1;
                while(j>=0 && result[j] > temp){
                    result[j+1] = result[j];
                    j--;
                }
                result[j+1] = temp;
            }
            return result;
        } catch(NullPointerException e) {
            System.out.println(e.getMessage());
            throw new NullPointerException("Error");
        }
    }

    public static int[] single_sort(int[] a) throws NullPointerException{
        try {
            int j;
            int temp;
            for(int i=0;i<a.length;i++){
                temp = a[i];
                j = i-1;
                while(j>=0 && a[j] > temp){
                    a[j+1] = a[j];
                    j--;
                }
                a[j+1] = temp;
            }
            return a;
        } catch(NullPointerException e) {
            System.out.println(e.getMessage());
            throw new NullPointerException("Error");
        }
    }
    public static void main(String[] args) {
        int[] array = {1,3,56,78,90,0,2,4,6,7,8,9,0,1};
        System.out.println("Insertion sort using two variables");
        try{
            array = two_sort(array);
        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
        for(int result:array){
            System.out.print (result+" ");
        }
        System.out.println("\nInsertion sort using single variable");

        try{
            array = single_sort(array);
        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
        for(int result:array){
            System.out.print (result+" ");
        }
    }
}
