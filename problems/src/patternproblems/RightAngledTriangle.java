package patternproblems;

public class RightAngledTriangle {
    public static void main(String[] args) {
        char symbol = '*';
        int h = 5;
        rightTriangle(symbol,h);
    }

    public static void rightTriangle(char symbol, int height){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(symbol+" ");
            }
            System.out.println();
        }
    }
}
