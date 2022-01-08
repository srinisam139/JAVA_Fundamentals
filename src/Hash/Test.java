package Hash;

public class Test {
    static int recursion(int n){
        int result=0;
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }
        result+=recursion(n-1)+recursion(n-2);
        return result;
    }
    public static void main(String[] args) {
        int result=recursion(5);
        System.out.println(result);
    }
}
