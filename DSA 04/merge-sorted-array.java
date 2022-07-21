import java.util.*;

class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        // for(int i=0;i<n;i++){
        // nums1[i+m]=nums2[i];
        // }

        // Arrays.sort(nums1);

        // System.out.println(nums1);

        int i = m - 1;
        int j = n - 1;

        int lastIndex = m + n - 1;

        while (j >= 0) {
            if (i>=0 && nums1[i] > nums2[j]) {
                nums1[lastIndex--] = nums1[i];
                i--;
            } else {
                nums1[lastIndex--] = nums2[j];
                j--;
            }
        }
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String args[]) {
        int arr1[] = new int []{1,5,6,0,0,0};
        

        int arr2[] = new int[] { 1, 2, 3 };
        int m=3;
        int n=arr2.length;


        merge(arr1,m,arr2,n);


    }
}