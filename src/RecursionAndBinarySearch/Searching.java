package RecursionAndBinarySearch;

public class Searching {
    public static void main(String[] args) {
        int array[] =  {2, 9, 10, 12, 21, 36, 37, 38, 39, 41, 56, 57, 77, 79, 83, 93, 98};
        boolean value = call(array,11);
        System.out.println(value);
    }
    public static boolean call(int[] arr, int target){
        int start=0;
        int end = arr.length-1;
        int mid = (start+end)/2;
        boolean a=false;
        while(start<=end){
            if(arr[mid]==target){
                System.out.println("Start value is "+start+" End value is "+end+" Target value is "+target+"Mid value is "+mid+" "+arr[mid]);
                a = true;
                break;
            } else if(arr[mid]>target){
                end = mid-1;
                mid = (start+end)/2;
                System.out.println("Start value is "+start+" End value is "+end+" Target value is "+target+"Mid value is "+mid+" "+arr[mid]);
            } else {
                start = mid+1;
                mid = (start+end)/2;
                System.out.println("Start value is "+start+" End value is "+end+" Target value is "+target+"Mid value is "+mid+" "+arr[mid]);
            }
        }
        return a;
    }
}
