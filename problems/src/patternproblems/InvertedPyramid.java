package patternproblems;

public class InvertedPyramid {
    public static void main(String[] args) {
        int height = 5;
        invertedPyramid(height);
    }

    public static void invertedPyramid(int rows){
        for (int i = rows; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}