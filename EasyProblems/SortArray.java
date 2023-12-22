package EasyProblems;
//Реализовать функцию sort, которая принимает массив array(int[]). Функция должна отсортировать массив по возрастанию.
//Запрещено использовать Arrays.sort.
public class SortArray {

    public static void main(String[] args) {
        int array[] = {7, 5, 9, 1, 4, 23, 15,2,18,90,34,12,4};


        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
        sort(array);


        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
        sort2(array);


        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

    public static void sort(int[] array) {
// классический бабл-сорт
        boolean sorted = false;
         while(!sorted){
            sorted = true;
           for(int i = 1; i < array.length; i++) {
                if(array[i] <  array[i-1]){
                    int temp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = temp;
                    sorted = false;
                }
            }
         }
    }
// хорошее решение из инета (обратный)
    public static void sort2(int[] array) {
        for (int i=0; i<array.length; i++)
            for (int j=0; j<array.length; j++)
                if (array[j] < array[i]) { //обратная сортировка
                    int a = array[i];
                    array[i] = array[j];
                    array[j] = a;
                }
    }
}
