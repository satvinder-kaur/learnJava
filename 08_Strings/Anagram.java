//Easy solution to valid anagram leetcode problem
//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
//typically using all the original letters exactly once.

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
          return false;
        }
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        
        return Arrays.equals(sChars, tChars);
    }
}
