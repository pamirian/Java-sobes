package EasyProblems;
// Напишите программу на Java для того,
// чтобы поменять местами значения, хранящиеся в двух переменных с помощью третьей переменной
public class SwapVariable {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        System.out.println("a="+a+" b="+b);
        int c = a; //c=10
            a = b; //a=15
            b = c; //b=10
        System.err.println("a="+a+" b="+b);

//Напишите программу на Java, чтобы поменять местами значения, хранящиеся в двух переменных,
//без использования третьей переменной
        int a2 = 10;
        int b2 = 15;
        System.err.println("a="+a2+" b="+b2);
        a2 = a2+b2; //a=25
        b2 = a2-b2; //b=25-15=10
        a2 = a2-b2; //a=25-10=15

        System.out.println("a="+a2+" b="+b2);

    }
}
