package LinearSearch;

public class Solution {
    public static int  linearSearch(int arr[], int x) {
          
      int idx = -1;
      for(int i = 0; i <= arr.length - 1; i++) {
           if(arr[i] == x) {
              idx = i;
              break;
           }
      }
     if(idx != -1) {
        return idx;
     }

        return -1;
    }
    public static void main(String[] args) {
       int element[] = {1,2,3,4,5,6};
       int x  = 1;
        System.out.println(linearSearch(element,x));
    }
}
