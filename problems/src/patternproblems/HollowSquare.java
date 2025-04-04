package patternproblems;

public class HollowSquare {
    public static void main(String[] args) {
        int height = 5;
        hollowSquare(height);
    }

    private static void hollowSquare(int height) {
        for (int i=1;i<=height;i++){
            if (i==1 || i==height){
                for (int j = 1; j <= height; j++) {
                    System.out.print("*");
                }
            }else {
                System.out.print("*");
                for (int j = 0; j < height-2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
