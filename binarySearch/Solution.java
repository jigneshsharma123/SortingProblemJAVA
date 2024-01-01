package binarySearch;
public class Solution {

    public static int BinarySearch(int[] arr, int x) {
        int len = arr.length;
        int end = len - 1;
        int start = 0; 
        while(start <= end) {
            int  mid = (start + end) / 2;
            if(arr[mid] == x ) {
                return mid + 1;
            }
            else if(arr[mid] < x) {
               start = mid  + 1;
            }else {
              end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
       int element[] = {1,2,3,4,5,6};
       System.out.println( BinarySearch(element,0));
    }
}