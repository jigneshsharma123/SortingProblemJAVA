# What is Binary Search 
```
1. Binary Search is an Algorithm used for searching the element in the given set of the element. 
2. there is a condition where we can use the binary search 
    * Element must be already shorted(accending or decending order )

Algorithm --> 
a --> find the lenght of the array using .length method
b --> iterate over the array utill end >= start 
     * calculate the mid = (start  + end) / 2;
     * check if (arr[mid] == x) return mid;
     * else if (arr[mid] < x)  start = mid + 1;
     * else end = mid - 1;
c --> return -1;

```