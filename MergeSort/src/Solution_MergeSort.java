import java.util.Arrays;

public class Solution_MergeSort {

    private static void merge(int[] input, int[] temp, int mid, int low, int high) {

        for (int x = low; x <= high; x++) {
            temp[x] = input[x];
        }

        int i = low, j = mid + 1;
        for (int x = low; x <= high; x++) {
            if (i > mid)
                input[x]=temp[j++];
            else if (j > high)
                input[x] = temp[i++];
            else if (temp[j] < temp[i])
                input[x] = temp[j++];
            else
                input[x] = temp[i++];


        }
        System.out.println(Arrays.toString(temp));
    }

    private static void sort(int[] input, int[] temp, int low, int high) {

        if (high <= low) {
            //displaySorted(input);
            return;
        }
        int mid = low + ((high - low) / 2);
        sort(input, temp, mid + 1, high);
        sort(input, temp, low, mid);
        merge(input, temp, mid, low, high);
    }

    private static void sort(int[] input) {
        int[] temp = new int[input.length];
        sort(input, temp, 0, input.length - 1);
    }

    public static void displaySorted(int[] a) {
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        int[] input = {3, 5, 6, 99, 1, 8, 3, 0, 5};
        Solution_MergeSort.sort(input);
            displaySorted(input);
    }

}
