package EasyProblems;

public class Parentheses {
    public static void main(String[] args) {
        Parentheses parentheses = new Parentheses();
        System.out.println(parentheses.isValid("(sdfasfaasdf)"));
    }
    public boolean isValid(String s) {
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                counter++;
                continue;
            }
            if (s.charAt(i) == ')') {
                if (counter==0) {
                    return false;
                }
                counter--;
            }
        }
        if (counter == 0) return true;
        return false;
    }
}