package RecursionAndBinarySearch;

class Recursion {

    public static void main(String[] args) {
        call(0);
    }
    public static void call(int n){
        if(n<10) call(n+1);
        System.out.println(n);
    }

}
