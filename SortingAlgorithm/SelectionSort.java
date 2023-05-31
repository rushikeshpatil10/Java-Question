package SortingAlgorithm;

public class SelectionSort {
    public static void SelectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j])
                // (arr[minPos] < arr[j] it print decending order of array
                {
                    minPos = j;

                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void Printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 5, 4, 1, 3, 2 };
        SelectionSort(arr);
        Printarr(arr);
    }
}
