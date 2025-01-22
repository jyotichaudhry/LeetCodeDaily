class Solution {
    public int longestPalindromeSubseq(String s) {
          int n = s.length();
        int[][] palindrome  = new int[n][n];
        for (int i = n-1; i >= 0 ; i--) {
            palindrome[i][i] = 1;
            for (int j = i+1; j < n ; j++) {
                if (s.charAt(i) == s.charAt(j)){
                    palindrome[i][j] = 2+palindrome[i+1][j-1];
                } else {
                    palindrome[i][j] = Math.max(palindrome[i][j-1],palindrome[i+1][j]);
                }
            }
        }
        return palindrome[0][n-1];
    }
}