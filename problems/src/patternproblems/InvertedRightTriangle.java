package patternproblems;

public class InvertedRightTriangle {
    public static void main(String[] args) {
        char symbol = '*';
        int h = 5;
        invertedTriangle(symbol,h);
    }

    public static void invertedTriangle(char symbol, int h){
        for (int i = h; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(symbol+" ");
            }
            System.out.println();
        }
    }
}
