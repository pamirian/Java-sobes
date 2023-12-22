package EasyProblems;
//Реализовать функцию join, которая принимает массивы array1 и array2.
// Функция должна объединить оба массива в один и вернуть новый сложившийся.
//Запрещено использовать Collections.addAll, System.arraycopy, ArrayConcatUtil, Stream, IntStream,
// ObjectArrays, ArrayList.

public class JoinArrays {
    public static void main(String[] args) {
        int[] array1 = {7, 5, 9, 1, 4, 4, 4, 4};
        int[] array2 = {1, 2, 3, 4, 8, 6, 3};

        int[] new_array = join(array1, array2);

        for (int i = 0; i < new_array.length; i++) {
            System.out.print(new_array[i] + " ");
        }
    }
    public static int[] join(int[] array1, int[] array2) {
        int[] newArray = new int[array1.length+array2.length];

          for (int i = 0; i < newArray.length; i++){
                while (i<array1.length){
                    newArray[i] = array1[i];
                    i++;
                }
            }
        for (int i = 0; i < newArray.length; i++){
            while (i<array2.length){
             newArray[array1.length+i]=array2[i];
                i++;
               }
            }
        return newArray;
    }
}
