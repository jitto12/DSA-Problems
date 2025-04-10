package recursion;

public class Fibo {
    public static void main(String[] args) {
        int f = 4;
        int result = fibo(f);
        System.out.println(result);
    }

    public static int fibo(int f){
        if (f<2){
            return f;
        }
        return fibo(f-1) + fibo(f-2);
    }
}
