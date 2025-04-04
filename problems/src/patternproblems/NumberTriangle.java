package patternproblems;

public class NumberTriangle {
    public static void main(String[] args) {
        int height = 5;
        numberTriangle(height);
    }

    private static void numberTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
