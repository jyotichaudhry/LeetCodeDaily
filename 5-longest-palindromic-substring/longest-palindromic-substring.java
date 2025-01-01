class Solution {
    public String longestPalindrome(String s) {
            int maxLen = 1;
        int startIdx = 0;
        int endIdx = 0;
        if(s.length()<=1) return s;
        if(s.length()==2 && s.charAt(0)==s.charAt(1)) return s ;
        int n = s.length();
        boolean [][]isPalindrome = new boolean[n][n];
        for (int i = 0; i < s.length(); i++) {
            isPalindrome[i][i] = true;
        }
        for (int i = n-1; i >=0 ; i--) {
            for (int j = i+1; j < s.length(); j++) {
                if (s.charAt(i)==s.charAt(j) && (j-i==1 || isPalindrome[i+1][j-1])){
                    isPalindrome[i][j]=true;
                }
                if(isPalindrome[i][j] && j-i+1>maxLen){
                    maxLen = j-i+1;
                    startIdx = i;
                    endIdx = j;
                }
            }
        }
        return s.substring(startIdx,endIdx+1);
    }
}