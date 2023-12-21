package EasyProblems;
/*
Implement the method that takes a strings and returns the new string that contains
every n-th character of the original string
“abcde” -> “bd” //2th char
“Hello Java” -> “el aa”  //2th char

“abcde” -> “c” //3th char
“Hello Java” -> “l v”  //3th char
 */
public class EveryNCharacter {
    public static void main(String[] args) {
        System.out.println("\"abcde\" -> "+everySecondCharacter("abcde"));
        System.out.println("\"Hello Java\" -> "+everySecondCharacter("Hello Java"));
    }

    public static String everySecondCharacter(String str) {
        String result = "";
        int n=3; //n-th chracter
        if(n>str.length()) result = "character " + n + " great than given string";
        else for (int i = n - 1; i < str.length(); i = i + n) result += str.charAt(i);
        return result;
    }
}