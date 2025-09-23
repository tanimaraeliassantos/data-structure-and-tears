
import java.util.Arrays;

/*
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
 * and two integers m and n, representing the number of elements
 * in nums1 and nums2 respectively.
 * Merge nums1 and nums2 into a single array sorted in
 * non-decreasing order.
 * The final sorted array should not be returned by the function,
 * but instead be stored inside the array nums1.
 * To accomodate this, nums1 has a length of m + n, where the first
 * m elements denote the elements that should be merged, and the last
 * n elements are set to 0 and should be ignored. nums2 has a length of n.
 */
public class MergeSortedArray {
    /*
     * Declare method, define input parameters: an integer nums1, the number of valid
     * elements in nums1, the integer array nums2 (to be merged into nums1),
     * the number of elements in nums2
     */
   
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //Start for loop with counter in 0 and let it continue for as long as the counter
        // is less than number of elements in nums2
        for (int i = 0; i < n; i++) {
            //Access element at index i in nums2 array, calculate the correct position
            // in nums1 where the element from nums2 should go
            nums1[m + i] = nums2[i];
        }
        //sort the array in non-decreasing order
        Arrays.sort(nums1);
    }
}
