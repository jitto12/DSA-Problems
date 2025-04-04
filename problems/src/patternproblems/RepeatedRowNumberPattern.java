package patternproblems;

public class RepeatedRowNumberPattern {

    public static void main(String[] args) {
        int height = 5;
        repeatedRowNumberPattern(height);
    }

    private static void repeatedRowNumberPattern(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
