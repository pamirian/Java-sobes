package EasyProblems;
//Реализовать функцию range_min_max, которая принимает массив array(int[]), числа min и max.
// Функция должна вернуть массив из элементов array, где каждый элемент больше min включительно
// и меньше max включительно.

public class RangeArraysMinMax {
    public static void main(String[] args) {
        int array[] = {7, 5, 9, 1, 7, 8, 24};
        int[] new_array = rangeMinMax(array, 3, 9);

        for (int i = 0; i < new_array.length; i++) {
            System.out.print(new_array[i] + " ");
        }
    }
    public static int[] rangeMinMax(int[] array, int min, int max) {
        int number=0;
        for (int i=0; i<array.length; i++){
            if((array[i]>=min)&&(array[i]<=max)){
                number=number+1;
            }
        }

        int[] newArray =new int[number];
         for (int i=0, j=0; i<array.length; i++){
            if((array[i]>=min)&&(array[i]<=max)){
                newArray[j]=array[i];
                j++;
            }
        }
    return newArray;
    }
}
