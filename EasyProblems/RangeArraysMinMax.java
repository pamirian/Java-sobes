package EasyProblems;

public class RangeArraysMinMax {
    public static void main(String[] args) {
        int array[] = {7, 5, 9, 1, 4};
        int[] new_array = rangeMinMax(array, 3, 5);

        for (int i = 0; i < new_array.length; i++) {
            System.out.print(new_array[i] + " ");
        }

    }
    public static int[] rangeMinMax(int[] array, int min, int max) {
        int n = 0;
        for (int value: array) {
            if (value >= min && value <= max){
                n++;
            }
        }
        int[] arr2 = new int[n];
        for (int i = 0, j = 0; i < array.length; i++){
            if (array[i] >= min && array[i] <= max) {
                arr2[j] = array[i];
                j++;
            }
        }
        return arr2;
    }

    public static int[] rangeMinMax2(int[] array, int min, int max) {
        int number=0;
        for (int i=0; i<array.length; i++){
            if((array[i]>=min)&&(array[i]<=max)){
                number=number+1;
            }
        }

        int[] newArray =new int[number];

        for (int i=0; i<array.length; i++){
            if((array[i]>=min)&&(array[i]<=max)){
                for (int j=0; j<newArray.length; j++){
                    newArray[j]=array[i];
                }
            }
        }

        return newArray;
    }
}
