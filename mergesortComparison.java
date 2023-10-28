package MergeSort;

import java.util.Arrays;
import java.util.Random;

public class mergesortComparison {

    public static boolean isSorted(int[]arr) {
        for (int i = 0; i < arr.length -1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        int arrSize = 10;
        int range = 1000000;
        int[] arr = new int[arrSize];
        Random rand = new Random();
        for (int i = 0; i < arrSize; i++) {
            arr[i] = rand.nextInt(range);
        }

        System.out.println("Original array: " + Arrays.toString(arr));

        int[] arrRecursiveSort = arr.clone();
        int[] arrIterativeSort = arr.clone();

        long start = System.nanoTime();
        rMergeSort.sort(arrRecursiveSort, 0, arrRecursiveSort.length - 1);
        long end = System.nanoTime();
        long recursiveTime = (end - start);
        System.out.println("Time taken for Recursive Mergesort: " + recursiveTime);
        System.out.println("Sorted Recursive Array: " + Arrays.toString(arrRecursiveSort));

        if (isSorted(arrRecursiveSort)) {
            System.out.println("Recursive Mergesort was successful");
        }
        else {
            System.out.println("Recursive Mergesort was not successful");
        }

        start = System.nanoTime();
        iMergeSort.sort(arrIterativeSort);
        end = System.nanoTime();
        long iterativeTime = (end - start);
        System.out.println("Time taken for Iterative Mergesort:  " + iterativeTime);
        System.out.println("Sorted Iterative Array: " + Arrays.toString(arrRecursiveSort));

        if(isSorted(arrIterativeSort)) {
            System.out.println("Iterative Mergesort was successful");
        }
        else {
            System.out.println("Iterative Mergesort was not successful");
        }
    }

}
