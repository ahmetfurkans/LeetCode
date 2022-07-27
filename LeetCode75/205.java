// https://leetcode.com/problems/isomorphic-strings/
class Solution {
    public boolean isIsomorphic(String s, String t) {
        char [] charList = new char[128];
        char [] charTList = new char[128];

        for (int i = 0; i < s.length(); i++) {
            int temp = s.charAt(i);
            char tChar = t.charAt(i);
            if ((charList[temp] != tChar && charList[temp] != 0)||(charTList[(int) tChar] != (char) temp&& charTList[(int) tChar] !=0)){
                return false;
            }else{
                charList[temp]  = tChar;
                charTList[(int) tChar] = (char) temp;
            }
        }
        return true;
    }
}