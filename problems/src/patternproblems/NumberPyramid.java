package patternproblems;

public class NumberPyramid {
    public static void main(String[] args) {
        int height = 5;
        numberPyramid(height);
    }

    private static void numberPyramid(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = i; j <= height-1; j++) {//Printing the Spaces.
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
