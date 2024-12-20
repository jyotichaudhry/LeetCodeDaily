class Solution {
   public int isPrefixOfWord(String sentence, String searchWord) {
      String []wordList = sentence.split(" ");
      int len = searchWord.length();
        for (int i = 0; i < wordList.length; i++) {
            if (wordList[i].regionMatches(0,searchWord,0,len))
                return i+1;
        }
        return -1;
    }
}