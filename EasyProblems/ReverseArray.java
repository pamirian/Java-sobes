package EasyProblems;
//Реализовать функцию reverse, которая принимает массив array(int[]).
// Функция должна перевернуть массив, то есть первый элемент становится последним, второй предпоследним, ...,
// последний элемент первым.
//Запрещено использовать Collections.reverse.
public class ReverseArray {
    public static void main(String[] args) {
        int array[] = {5,1,3,4,2};
        reverse(array);
        int array2[] = {5,1,3,4,2};
        reverse2(array2);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n---");
        for (int i = 0; i < array2.length; i++) {
            System.err.print(array2[i] + " ");
        }
    }
// мое решение, затраченное время: 8 мин.
    public static void reverse(int[] array) {
        for (int i = 0; i<array.length/2; i++) {
                int temp = array[i];
                array[i]= array[array.length-1-i];
                array[array.length-1-i] = temp;
        }
    }
//хорошее решение из инета с двумя указателями в for-лупе
    public static void reverse2(int[] array) {
        int temp;
        for (int i = 0, j = array.length-1; i < j; i++, j--) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;

        }

    }
}