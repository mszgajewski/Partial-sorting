import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int[] selectionSort(int[] array, int k) {
        for (int i = 0; i < k; i++) {
            int index = i; // the index of the found min

            /* Iterating over the unsorted subarray to find the min */
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[index]) {
                    index = j;


                }
            }

            int max = array[index];

            array[index] = array[i];

            array[i] = max;


                /* Exchanging the found max and the current element */
        }

        return Arrays.copyOf(array, k);
    }
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int length = Integer.parseInt(scn.next());
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = Integer.parseInt(scn.next());

        }

        int k = Integer.parseInt(scn.next());

        int[] result = selectionSort(array, k);

        for (int item : result) {
            System.out.print(item + " ");
        }

    }
}
