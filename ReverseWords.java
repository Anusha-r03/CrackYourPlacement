class Solution {
    public String reverseWords(String s) {
        // Trim the input string and split it by one or more whitespace characters
        String[] str = s.trim().split("\\s+");
        String op = "";

        // Iterate from the end of the array to the beginning
        for (int i = str.length - 1; i > 0; i--) {
            op += str[i] + " ";
        }
        
        // Add the first word (str[0]) to the output without trailing space
        op += str[0];
        
        return op;
    }
}
