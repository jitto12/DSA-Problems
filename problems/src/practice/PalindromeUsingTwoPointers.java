package practice;

public class PalindromeUsingTwoPointers {
    public static void main(String[] args) {
        String word = "MADAM";
        System.out.println(palindromeTaker(word));
    }

    public static String palindromeTaker(String word){
        int low = 0;
        for (int high=low+1; high < word.length() ; high++) {
            if (word.charAt(low) == word.charAt(high)){
                return isPalindrome(word.substring(low,high+1));
            }else {
                high++;
            }
        }
        low++;
        return null;
    }

    public static String isPalindrome(String word){
        int low =0;
        int high = word.length()-1;
        boolean palindrome = true;
        while (low<=high){
            if (word.charAt(low) != word.charAt(high)){
                palindrome = false;
                return null;
            }else {
                low++;
                high--;
            }
        }
        return word;
    }
}
