package patternproblems;

public class PyramidPattern {
    public static void main(String[] args) {
        char symbol = 'J';
        int h = 5;
        pyramid(symbol,h);
    }

    public static void pyramid(char symbol, int height){
        for (int i = 1; i <= height; i++) {
            // Print spaces
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
