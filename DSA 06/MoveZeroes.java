
import java.util.*;

class MoveZeroes {
public static void pushZerosAtEnd(ArrayList<Integer> arr) {

int i = 0;
int j = arr.size() - 1;

while (i < j) {
if (arr.get(i) == 0) {
int newZero = arr.remove(i);
arr.add(j, newZero);
j--;
} else {
i++;
}

}
System.out.println(arr);
}

public static void main(String[] args) {
ArrayList<Integer> arr = new ArrayList<>();
arr.add(0);
arr.add(1);
arr.add(-2);
arr.add(0);
arr.add(0);
arr.add(0);
arr.add(0);
arr.add(0);
arr.add(4);
arr.add(0);
arr.add(5);
arr.add(9);

pushZerosAtEnd(arr);

}
}




// Traverse the given array ‘arr’ from left to right. While traversing, maintain
// count of non-zero elements in array. Let the count be ‘count’. For every
// non-zero element arr[i], put the element at ‘arr[count]’ and increment
// ‘count’. After complete traversal, all non-zero elements have already been
// shifted to front end and ‘count’ is set as index of first 0. Now all we need
// to do is that run a loop which makes all elements zero from ‘count’ till end
// of the array.
// Below is the implementation of the above approach.

// Best Approach

// public void moveZeroes(int[] nums) {
// if (nums == null || nums.length == 0) return;

// int insertPos = 0;
// for (int num: nums) {
// if (num != 0) nums[insertPos++] = num;
// }

// while (insertPos < nums.length) {
// nums[insertPos++] = 0;
// }
// }





// Approach:Element copy to the new array

// class MoveZeroes {

// public static void pushZerosAtEnd(int arr[]) {
//
// int n = nums.length;
// int newArr[] = new int[n];
// int j = 0;
// for (int i = 0; i < n; i++) {
// if (nums[i] != 0) {
// newArr[j++] = nums[i];
// }
// }

// while (j < n) {
// newArr[j++] = 0;
// }
// for(int i=0;i<n;i++){
// nums[i]=newArr[i];
// }
// System.out.println(Arrays.toString(newArr));

// public static void main(String[] args) {
// int arr[] = new int[] { 1, 0, 0, 0, 0, -2, 0, 0, 4, 5, 9 };
// pushZerosAtEnd(arr);
// }
// }






// Approach: The approach is pretty simple. We will use 0 as a pivot element and
// whenever we see a non zero element we will swap it with the pivot element. So
// all the non zero element will come at the beginning.

// class MoveZeroes {

// public static void pushZerosAtEnd(int arr[])
// {
// int n = arr.length;
// int j = 0;
// for (int i = 0; i < n; i++) {
// if (arr[i] != 0) {
// // Swap - A[j] , A[i]
// swap(arr, j, i); // Partitioning the array
// j++;
// }
// }
// for (int i = 0; i < n; i++) {
// System.out.print(arr[i] + " "); // Print the array
// }

// }
// public static void swap(int[] A, int a, int b)
// {
// int temp = A[a];
// A[a] = A[b];
// A[b] = temp;
// }

// public static void main(String [] args){
// int arr[]=new int[]{1,0,0,0,0, -2,0,0, 4, 5, 9};
// pushZerosAtEnd(arr);


// }
// }