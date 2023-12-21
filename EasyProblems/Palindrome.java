package EasyProblems;

/*
Write method boolean isPalindrome(String) that checks whether a given word is a palindrome.
A palindrome is a word that reads the same from the front and the back.
isPalindrome(“довод”) -> true
isPalindrome(“невод”) -> false
 */
public class Palindrome {
    public static void main(String[] args) {
        String str1 = "довод";
        String str2 = "невод";

        palindrome("довод");
        palindrome("невод");
        System.out.println("---");
        System.out.println(str1+" -> "+palindrome2(str1));
        System.out.println(str2+" -> "+palindrome2(str2));
    }
    public static void palindrome(String str) {
        boolean result = true;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i)) != (str.charAt((str.length() - 1) - i))) {
                result = false;
            }
        }
        System.out.println(str + " -> " + result);
    }
// version with method returning result


    public static boolean palindrome2(String str) {
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i)) != (str.charAt((str.length()-1) - i))) {
                return false;
            }
        }
        return true;
    }
}
