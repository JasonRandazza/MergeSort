package MergeSort;

public class rMergeSort {
    

    public static void sort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) /2;
            sort(arr, left, mid);
            sort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid,  int right) {
        int num1 = mid - left + 1;
        int num2 = right - mid;

        int[] arrL = new int[num1];
        int[] arrR = new int[num2];

        System.arraycopy(arr, left, arrL, 0, num1);
        for (int j = 0; j < num2; ++j) {
            arrR[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;
        while ( i < num1 && j < num2) {
            if( arrL[i] <= arrR[j]) {
                arr[k] = arrL[i];
                i++;
            }
            else {
                arr[k] = arrR[j];
                j++;
            }

            k++;
        }

        while (i < num1) {
            arr[k] = arrL[i];
            i++;
            k++;
        }

        while (j < num2) {
            arr[k] = arrR[j];
            j++;
            k++;
        }
    }
}
