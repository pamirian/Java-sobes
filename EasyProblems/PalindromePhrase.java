package EasyProblems;

/*
Implement the previous task for phrase. Ignore spaces, punctuation marks ( “, . –“) and regardless of case.
Hint: use the String.toLowerCase method
 */
public class PalindromePhrase {
    public static void main(String[] args) {
        palindrome("А роза упала на лапу Азора");
        palindrome("Тарту дорог, как город утрат.");
        palindrome("И темен город. Мороз, узором дорог не мети.");
    }

    public static void palindrome(String str) {
        str = str.toLowerCase();
        boolean result = true;
        String noGaps = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' '&&(str.charAt(i) != ','&&(str.charAt(i) != '.'))){
                noGaps = noGaps + str.charAt(i);
            }
        }
        for (int i = 0; i < noGaps.length(); i++) {
            if ((noGaps.charAt(i)) != (noGaps.charAt((noGaps.length() - 1) - i))) {
                result = false;
            }
        }
        System.out.println(str + " -> " + result);
    }
}
