package patternproblems;

public class ProgramPattern {
    public static void main(String[] args) {
        String word = "JITTO";
        int middle = word.length()/2;
        StringBuilder res = new StringBuilder();
        for (int i = middle; i < word.length(); i++) {
            res = res.append(word.charAt(i));
            System.out.println(res+"$");
        }
        for (int i = 0; i < middle; i++) {
            res = res.append(word.charAt(i));
            System.out.println(res+"$");
        }
    }
}
