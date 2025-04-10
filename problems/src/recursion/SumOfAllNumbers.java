package recursion;

public class SumOfAllNumbers {
    public static void main(String[] args) {
        int sum = 1234;
        System.out.println(sum(sum));
    }

    static int sum(int n){
        if (n==0){
            return 0;
        }
        return (n%10) + sum(n/10);
    }
}
