package Practicum_1;

public class Question1 {
    public static boolean CompareArrays(int[] T1, int[] T2){
        boolean result=false;
        for(int i=0;i<T1.length;i++) {
            if (T1[i] > T2[i]) {
                result = true;
            } else {
                result=false;
                break;
            }
        }
        return result;
    }
    public static boolean CompareArraysRecursive(int[] T1, int[] T2, int n){
       while(n>=0){
           boolean result=false;
           if(n==0){
               return true;
           }
           if(T1[n]>T2[n]){
               result= CompareArraysRecursive(T1,T2,n--);;
              return result;
           } else {
               return false;
           }
       }
       return true;
    }

    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6};
        int arr2[]={0,4,2,3,4,5};
        boolean value=CompareArrays(arr1,arr2);
        boolean value2=CompareArraysRecursive(arr1, arr2,arr1.length);
        System.out.println(value);
    }
}
