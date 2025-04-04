package patternproblems;

public class DiamondPattern {
    public static void main(String[] args) {
        int height = 5;
        diamondTop(height);
        diamondBottom(height);
    }

    public static void diamondTop(int height){
        for (int i = 1; i <= height; i++) {
            for (int j = i; j <= height-1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=(2*i)-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void diamondBottom(int height){
        for (int i = height-1; i > 0; i--) {
            for (int j = i; j < height; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i)-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
