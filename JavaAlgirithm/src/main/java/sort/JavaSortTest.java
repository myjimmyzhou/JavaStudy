package sort;

import java.util.Arrays;

public class JavaSortTest {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 5, 6, 7, 9, 4, 12, 0};
        JavaSort.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr1 = new int[]{2, 5, 6, 7, 9, 4, 12, 0};
        JavaSort.selectSort(arr1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = new int[]{2, 5, 6, 7, 9, 4, 12, 0};
        JavaSort.insertSort(arr2);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = new int[]{2, 5, 6, 7, 9, 4, 12, 0};
        JavaSort.shellSort(arr3);
        System.out.println(Arrays.toString(arr3));

        int[] arr4 = new int[]{2, 5, 6, 7, 9, 4, 12, 0};
        int[] temp = JavaSort.mergeSort(arr4);
        System.out.println(Arrays.toString(temp));

        int[] arr5 = new int[]{2, 5, 6, 7, 9, 4, 12, 0};
        JavaSort.quickSort(arr5, 0, arr5.length - 1);
        System.out.println(Arrays.toString(arr5));
    }
}
