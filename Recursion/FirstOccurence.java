
public class FirstOccurence {
    public static void main(String args[]) {
        int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        System.out.println(firstOccurance(arr, 0, 5));
        System.out.println(lastOccurance(arr, 0, 5));
    }

    public static int firstOccurance(int arr[], int i, int key) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }

        return firstOccurance(arr, i + 1, key);
    }

    public static int lastOccurance(int arr[], int i, int key) {
        if (i == arr.length) {
            return -1;
        }
        int isfound = lastOccurance(arr, i + 1, key);
        if (isfound == -1 && arr[i] == key) {
            return i;
        }
        return isfound;
    }
}
