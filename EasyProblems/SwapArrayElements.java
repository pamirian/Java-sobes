package EasyProblems;
// Реализовать функцию swap, которая принимает массив array(int[]), числа i и j.
// Функция должна поменять местами в массиве два числа по указанным индексам i и j.

public class SwapArrayElements {

    public static void main(String[] args) {
        int array[] = {7, 5, 9, 1, 4};
        swap(array, 0, 1);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void swap(int[] array, int i, int j) {
        if (i<0||j<0||array.length==0){
            System.err.println("wrond index");
            return;
        }
        else {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
