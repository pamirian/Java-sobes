package EasyProblems;

import java.util.Scanner;

//Напишите программу на Java для переворачивания строки,
// изменив расположение символов в строке задом наперёд без использования встроенных в String функций
public class InverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        //String str = "измените расположение символов в строке задом наперёд";
        StringBuffer str2 = new StringBuffer();
        for(int i=str.length()-1; i>=0; i--) {str2.append(str.charAt(i));}
        System.out.println(str2);
//Вариант 2 с помощью аппенд
        String st = "измените расположение символов в строке задом наперёд";
        StringBuilder stB = new StringBuilder();
        stB.append(st);
        stB.reverse();// используем StringBuilder для переворота строки
        System.out.println(stB);
// вариант 3 с помощью toCharArray()
        char[] symbols = st.toCharArray();
        // конвертируем строку в массив символов, затем выводим символы на экран в обратном порядке
        for(int x= symbols.length-1; x>=0; x--) {
        System.out.print(symbols [x]);
        }

    }
}
