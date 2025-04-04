package patternproblems;

public class HollowTriangle {
    public static void main(String[] args) {
        int height = 10;
        triangle(height);
    }
    public static void triangle(int height){
        for (int i = 0; i < height; i++) {
            for (int j = i; j < height-1; j++) {
                System.out.print(" ");
            }
            if (i!=height-1){
                if (i==0){
                    System.out.print("*");
                }else {
                    System.out.print("*");
                    for (int j = 0; j < (2*i)-1; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
            }else {
                for (int j = 0; j <= (2*i); j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
