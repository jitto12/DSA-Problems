package patternproblems;

public class InvertedFloydsTriangle {
    public static void main(String[] args) {
        int height = 5;
        invertedFloydsTriangle(height);
    }

    private static void invertedFloydsTriangle(int height) {
        int num = 10;
        for (int i = height; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(num+" ");
                num--;
            }
            System.out.println();
        }
    }
}
