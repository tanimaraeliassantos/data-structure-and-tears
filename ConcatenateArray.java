public class ConcatenateArray {
    public int[] getConcatenation(int[] nums) {

        // Pseudocode:
        // 1. Get the length of the input array nums and store it in a variable n
        // 2. Create a new integer array ans with a length of 2 * n
        // 3. Loop through the input array nums from index 0 to n - 1
        // 4. For each index i, assign the value of nums[i] to ans[i] and ans[i + n]
        // 5. Return the new array ans
        int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }
}
