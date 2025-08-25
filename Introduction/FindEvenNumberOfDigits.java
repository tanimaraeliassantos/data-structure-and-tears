// Given an array nums of integers, 
// return how many of them contain an even number of digits.

class FindEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        // Initialize variable for counter
        int evenDigitsCount = 0;
        // Start looping through numbers of array
        for( int num : nums) {
            // Transform numbers into string and count its characters
            String s = String.valueOf(num);
            // If length of string is even then counter goes up
            if(s.length() % 2 == 0) {
                evenDigitsCount++;
            }
        }
        //Return counter
        return evenDigitsCount;
    } 
}
