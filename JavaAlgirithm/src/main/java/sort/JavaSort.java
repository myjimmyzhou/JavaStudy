package sort;

import java.util.Arrays;

@SuppressWarnings("all")
public class JavaSort {
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int pre = i - 1;
            int curr = arr[i];
            while (pre >= 0 && arr[pre] > curr) {
                arr[pre + 1] = arr[pre];
                pre--;
            }
            arr[pre + 1] = curr;
        }
    }

    public static void shellSort(int[] arr) {
        int len = arr.length;
        for (int gap = (int) Math.floor(len); gap > 0; gap = (int) Math.floor(gap / 2)) {
            for (int i = gap; i < len; i++) {
                int j = i;
                int curr = arr[i];
                while (j - gap >= 0 && curr < arr[j - gap]) {
                    arr[j] = arr[j - gap];
                    j = j - gap;
                }
                arr[j] = curr;
            }
        }
    }

    public static int[] mergeSort(int[] arr) {
        int len = arr.length;
        if (len < 2) {
            return arr;
        }
        int middle = (int) Math.floor(len / 2);
        int[] left = new int[middle];
        int[] right = new int[middle];
        System.arraycopy(arr, 0, left, 0, middle);
        System.arraycopy(arr, middle, right, 0, middle);
        return merge(mergeSort(left), mergeSort(right));
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int low = start;
            int hight = end;
            int curr = arr[start];
            while (low < hight) {
                while (low < hight && arr[hight] >= curr) {
                    hight--;
                }
                arr[low] = arr[hight];
                while (low < hight && arr[low] <= curr) {
                    low++;
                }
                arr[hight] = arr[low];
            }
            arr[low] = curr;
            quickSort(arr, start, low);
            quickSort(arr, low + 1, end);
        }
    }

    private static int[] merge(int[] leftArr, int[] rightArr) {
        int[] arr = new int[leftArr.length + rightArr.length];
        if (leftArr == null && rightArr == null)
            return new int[0];

        int l = 0, r = 0;
        while (l < leftArr.length && r < rightArr.length) {
            if (leftArr[l] < rightArr[r]) {
                arr[l + r] = leftArr[l];
                l++;
            } else {
                arr[l + r] = rightArr[r];
                r++;
            }
        }
        if (l != leftArr.length) {
            System.arraycopy(leftArr, l, arr, l + r, leftArr.length - l);
        }
        if (r != rightArr.length) {
            System.arraycopy(rightArr, r, arr, l + r, rightArr.length - r);
        }
        return arr;
    }
}
