package patternproblems;

public class SquarePattern {
    public static void main(String[] args) {
        char symbol = '*';
        int h = 3;
        square(symbol,h);
    }

    public static void square(char symbol, int height){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print(symbol+"  ");
            }
            System.out.println();
        }
    }
}
