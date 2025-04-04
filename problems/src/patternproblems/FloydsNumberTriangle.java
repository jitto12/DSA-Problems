package patternproblems;

public class FloydsNumberTriangle {
    public static void main(String[] args) {
        int height = 5;
        floydsTriangle(height);
    }

    private static void floydsTriangle(int height) {
        int num =1;
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
