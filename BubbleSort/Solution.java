package BubbleSort;

public class Solution {

    // Helper method to swap elements in the array
    private static void swap(int arr[], int j, int pos) {
        int temp = arr[j];
        arr[j] = arr[pos];
        arr[pos] = temp;
    }

    // Bubble Sort algorithm with an optimization using a flag
    private static void bubbleSort(int[] arr) {
        int i, j;

        // Outer loop for the number of passes (n - 1 passes required to sort the array)
        for (i = 0; i < arr.length - 1; i++) {
            int flag = 0; // Flag to check if any swaps were made in the current pass

            // Inner loop for comparing and swapping elements
            for (j = 0; j < arr.length - 1 - i; j++) {
                // If the current element is greater than the next one, swap them
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    flag = 1; // Set the flag to indicate a swap was made
                }
            }

            // If no swaps were made in the pass, the array is already sorted
            if (flag == 0) {
                break;
            }
        }
    }

    // Main method to test the bubbleSort function
    public static void main(String[] args) {
        int arr[] = {50, 25, 5, 20, 10};
        bubbleSort(arr);
        printArrayElement(arr);
    }

    // Helper method to print the elements of the array
    private static void printArrayElement(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
