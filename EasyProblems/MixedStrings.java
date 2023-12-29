package EasyProblems;

/*
Implement the method that takes two Strings and return the String that contain chars from the first
string mixed through one with chars from other String
“abcd”, “qwer” -> “aqbwcedr”
“ab”, “qwer” -> “aqbwer”
“abcd”, “qw” -> “aqbwcd”
 */
public class MixedStrings {
    public static void main(String[] args) {
        System.out.println("\"abcd, qwer\" -> "+mixedStrings("abcd", "qwer"));
        System.out.println("\"ab, qwer\" -> "+mixedStrings("ab", "qwer"));
        System.out.println("\"abcd, qw\" -> "+mixedStrings("abcd", "qw"));git
    }

    public static String mixedStrings(String str1, String str2) {
        String result = "";
        if (str1.length() > str2.length()) {
            for (int i = 0; i < (str2.length()); i++) {
                result = result + str1.charAt(i) + str2.charAt(i);
            }
            for (int i = (str1.length() - str2.length()); i < str1.length(); i++) {
                result = result + str1.charAt(i);
            }
        } else if (str2.length() > str1.length()) {
            for (int i = 0; i < (str1.length()); i++) {
                result = result + str1.charAt(i) + str2.charAt(i);
            }
            for (int i = (str2.length() - str1.length()); i < str2.length(); i++) {
                result = result + str2.charAt(i);
            }
        } else
        {
            for (int i = 0; i < (str1.length()); i++) {
                result = result + str1.charAt(i) + str2.charAt(i);
            }
        }
        return result;
    }
}