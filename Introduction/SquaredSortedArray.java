
import java.util.Arrays;


// Given an integer array nums sorted in non-decreasing order, return an array
// of the squares of each number sorted in non-decreasing order.
// Solution 1: O(n logn) time complexity, n is number of elements in the array.
class SquaredSortedArray {
    public int[] sortedSquares(int[] nums) {
        // Create new array to store numbers
        int[] result = new int[nums.length];
        //Run loop through array until it reachs its maximum length
        for (int i = 0; i < nums.length; i++) {
            //for each number of the array, multiply it by itself to sqaure it
            result[i] = nums[i] * nums[i];
        }
        //sort array in required order
        Arrays.sort(result);
        // return array
        return result;
    }
}