package EasyProblems;

public class CamelCaseVar {
    public static void main(String[] args) {
        System.out.println(toCamelCase("the-stealth-warrior"));
    }

        static String toCamelCase(String s){
            String newStr = "";
            for(int i= 0; i<s.length(); i++){
                char sym = s.charAt(i);
                if((sym!='-'&&sym!='_'))
                {
                    newStr = newStr+sym;
                }
            }
            return newStr;
        }
    }

