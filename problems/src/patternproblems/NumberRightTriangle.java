package patternproblems;

public class NumberRightTriangle {
    public static void main(String[] args) {
        int height = 5;
        rightAlignedNumberTriangle(height);
    }

    private static void rightAlignedNumberTriangle(int h) {
        for (int i = 1; i <= h; i++) {
            for (int j = i; j <= h-1; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" "+k);
            }
            System.out.println();
        }
    }
}
