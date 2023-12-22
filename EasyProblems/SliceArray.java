package EasyProblems;
//Реализовать функцию slice, которая принимает массив array(int[]), числа from и to.
// Функция должна вернуть элементы массива array от индекса from (включая from) и до to.

public class SliceArray {

    public static void main(String[] args) {
        int array[] = {7, 5, 9, 1, 5, 9, 1, 4};
        int[] new_array = slice(array, 0, 5);

        for (int i = 0; i < new_array.length; i++) {
            System.out.print(new_array[i] + " ");
        }
        System.out.println("\n---");


        //тест для решения из инета
        int array2[] = {7, 5, 9, 1, 5, 9, 1, 4};
        int[] new_array2 = slice(array, 0, 5);

        for (int i = 0; i < new_array2.length; i++) {
            System.out.print(new_array2[i] + " ");
        }
    }

// мое решение, затраченное время: 5 мин.
    public static int[] slice(int[] array, int from, int to) {
        int number =0;
        for (int i=from; i<to; i++){
            number=number+1;
        }

        int[] arr2 = new int[number];

            for (int j = 0, i=from; i<to && j < array.length-1; i++){
                arr2[j] = array[i];
                j++;
        }
        return arr2;
    }

    // классное решение из инета

    public static int[] slice2(int[] array, int from, int to) {
        int length = to - from;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = array[from + i];
        }
        return result;
    }

}
