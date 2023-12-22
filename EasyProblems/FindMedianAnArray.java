package EasyProblems;
//Реализовать функцию median, которое находится в середине массива, если его упорядочить по возрастанию,
// то есть такое число, что половина из элементов набора не меньше него, а другая половина не больше.
//Если кол-во элементов в массиве четное, то нужно вернуть левое значение медианы.

public class FindMedianAnArray {
    public static void main(String[] args) {
        int array[] = {7, 5, 9, 1, 4, 90, 99};
        int median_number = median(array);
        int median_number2 = median2(array);

        System.out.println(median_number);
        System.out.println(median_number2);
    }

    public static int median(int[] array) {
        for (int i=0; i<array.length; i++)
            for (int j=0; j<array.length; j++)
                if (array[j] > array[i]) {
                    int a = array[i];
                    array[i] = array[j];
                    array[j] = a;
                }
            for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");}
        System.out.println();
        if(array.length!=0) {
            return array.length%2!=0?array[array.length/2]:array[array.length/2-1];
                }
        return 0;
    }

    // решение из интернета

    public static int median2(int[] array) {
        // Написать решение сюда ↓
        java.util.Arrays.sort(array);
        return array.length > 0
                ? array[(array.length - 1) / 2]
                : 0;
    }
}
