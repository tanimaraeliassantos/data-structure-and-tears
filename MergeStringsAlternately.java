public class MergeStringsAlternately {
    // pseudo code
    // 1. Create a StringBuilder to store the merged string.
    // 2. Initialize two pointers, one for each string.
    // 3. While both pointers are within the bounds of their respective strings:
    // a. Append the character from the first string to the StringBuilder.
    // b. Append the character from the second string to the StringBuilder.
    // c. Move both pointers to the next character.
    // 4. If there are remaining characters in the first string, append them to the
    // StringBuilder.
    // 5. If there are remaining characters in the second string, append them to the
    // StringBuilder.
    // 6. Convert the StringBuilder to a string and return it.
    public String mergeAlternately(String word1, String word2) {
        StringBuilder mergedString = new StringBuilder();
        int i = 0, j = 0;
        while (i < word1.length() && j < word2.length()) {
            mergedString.append(word1.charAt(i++));
            mergedString.append(word2.charAt(j++));
        }
        // Append any remaining characters from either string
        while (i < word1.length()) {
            mergedString.append(word1.charAt(i++));
        }
        while (j < word2.length()) {
            mergedString.append(word2.charAt(j++));
        }
        return mergedString.toString();
    }
}
