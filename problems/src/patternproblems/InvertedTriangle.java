package patternproblems;

public class InvertedTriangle {
    public static void main(String[] args) {
        int height = 5;
        invertedNumberTriangle(height);
    }

    private static void invertedNumberTriangle(int height) {
        for (int i = height; i > 0; i--) {
            for (int j = 1; j<=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
