// Given a fixed-length integer array arr, duplicate each occurrence
//  of zero, shifting the remaining elements to the right.

public class DuplicateZeros {
    public void duplicateZerosArray(int[] array) {
        // Count length of array
        int n = array.length;
        // Initialize array with fixed length
        int[] resultingArray = new int[n];
        // Initialize pointer for original array
        int i = 0;
        // Initialize pointer for new array
        int possible_dups = 0;

        // Loop through i of array
        while (i < n && possible_dups < n) {
            // if the i is 0
            if (array[i] == 0) {
                // then we have to set the pointer to the new array as zero
                resultingArray[possible_dups] = 0;
                // then we have to increment the new array by one element
                possible_dups++;
                // if the new array still has the length of the original array
                if (possible_dups < n) {
                    // then we duplicate the zero
                    resultingArray[possible_dups] = 0;
                }

            } else {
                // if not zero copy element to new array
                resultingArray[possible_dups] = array[i];
            }
            // after looping through i
            // increment pointer and move to next element of the original array
            i++;
            // increment pointer and move to next element of new array
            possible_dups++;
        }

        // copy new into original array
        for (int k = 0; k < n; k++) {
            array[k] = resultingArray[k];
        }
    }
}
