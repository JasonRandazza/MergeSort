package MergeSort;

public class iMergeSort {

    public static void sort(int[] arr) {
        int num = arr.length;
        int[] temp = new int[num];

        for(int currSize = 1; currSize <= num - 1; currSize = 2 * currSize) {
            for (int left = 0; left < num - 1; left += 2 * currSize) {
                int mid = left + currSize - 1;
                int right = Math.min(left + 2 * currSize - 1, num - 1);
                merge(arr, temp, left, mid, right);
            }
        }
    }
    
    public static void merge(int[] arr, int[] temp, int left, int mid, int right) {
        for (int i = left; i <= right; i++) {
            temp[i] = arr[i];
        }

        int i = left, j = mid + 1, k = left;
        while(i <= mid && j <= right) {
            if ( temp[i] <= temp[j]) {
                arr[k] = temp[i];
                i++;
            }
            else {
                arr[k] = temp[j];
                j++;
            }

            k++;
        }

        while (i <= mid) {
            arr[k] = temp[i];
            k++;
            i++;
        }

        while (j <= right) {
            arr[k] = temp[j];
            k++;
            j++;
        }
    }
}
