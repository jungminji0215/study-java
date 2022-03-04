package algorithm.sorting;

import java.util.Arrays;

public class BubbleSorting {

    public static int[] bubbleSort(int[] arr) {
        int length = arr.length;

        for(int i = 0; i < length - 1; i++) {
            for(int j= 1 ; j < length - i - 1; j++) {
                if(arr[j] < arr[j-1]) {
                    swap(arr, j);
                }
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int j) {
        int temp;
        temp = arr[j -1];
        arr[j -1] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 6, 4, 9};
        int[] sortedArr = bubbleSort(arr);

        System.out.println(Arrays.toString(sortedArr));
    }
}
