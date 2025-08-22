class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        /* Initialize variable to count the maximum number of 1s
        * from the array and another variable to count the current
        * number of 1s in a row from the array
        */ 
        int max_count = 0;
        int current_count = 0;
        //Start loop to count the numbers 0 or 1
        for(int num : nums) {
            //If the number on the array is 1
            if(num == 1) {
                //then we add 1 to the current_count variable
                current_count++;
                // if not
            } else {
                // return the largest value of the two variables, max_count or current_count
                max_count = Math.max(max_count, current_count);
                // restart current_count to 0 since we have found a zero in the array
                current_count = 0;
            }
        }
        // Verifying that the final sequence in the array to make sure that the
        // the max_count is correct
        max_count = Math.max(max_count, current_count);
        //return final max_count 
        return max_count;
    }
}