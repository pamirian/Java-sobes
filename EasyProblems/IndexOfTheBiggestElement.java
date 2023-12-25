package EasyProblems;

/*
Implement a method that returns the index of the biggest element of a given array of int
{10, 33, 3, 5, -9} -> 1
 */
public class IndexOfTheBiggestElement {
    public static void main(String[] args) {
        int[] arr = {10, 33, 3, 55, 5, -9};
        System.out.println("{10, 33, 3, 5, -9} -> " + "["+getIndexOfTheBiggestElement(arr)+"]");
    }

    public static int getIndexOfTheBiggestElement(int[] arr) {
        int theBiggestElement = arr[0];
        int theBiggestIndex = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > theBiggestElement) {
                theBiggestElement = arr[i];
                theBiggestIndex = i;
            }
        }
        return theBiggestIndex;
    }
}