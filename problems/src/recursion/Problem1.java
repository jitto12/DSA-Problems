package recursion;

public class Problem1 {
    public static void main(String[] args) {
        int n = 5;
        revPrint(5);
    }

    static void revPrint(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        revPrint(n-1);
        System.out.println(n);
    }

    static void print(int n){
        if (n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n-1);
    }
}
