package recursion;

public class FactorialOfANumber {
    public static void main(String[] args) {
        int num = 5;
        int result = fact(num);
        System.out.println(result);
    }

    static int fact(int n){
        if (n<=1){
            return 1;
        }
        return n * fact(n-1);
    }
}
