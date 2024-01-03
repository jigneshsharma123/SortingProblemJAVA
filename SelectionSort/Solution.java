package SelectionSort;
public class Solution {
    public static int smallest(int arr[], int pos) {
        int min = Integer.MAX_VALUE;
        int n = arr.length;
        int idx = 0;
        for(int i =pos; i < n; i++) {
            if(min > arr[i]) {
               min = arr[i];
               idx = i;
            }
        }
        return idx;
    }
    public static void Selectionsort(int[] arr) {
         for(int i = 0; i < arr.length - 1; i++) {
            int idx = smallest(arr, i); //this is for finding the min idx of  element in the right part of the array;
            //swap the element to it right pos;
           int temp = arr[i];
           arr[i] = arr[idx];
           arr[idx] = temp;
         }
    }
    public static void main(String[] args) {
        int element[] = {2,3,0,1,-1,4};
        Selectionsort(element);
       printArra(element);
    }
    private static void printArra(int[] arr) {
        for(int i =0 ; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
