import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Boolean> map2 = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(!map1.containsKey(sChar)){
                if(map2.containsKey(tChar)) {
                    return false;
                }
                else{
                    map1.put(sChar, tChar);
                    map2.put(tChar, true);
                }
            }
            else{
                if(!(map1.get(sChar) == tChar)){
                    return false;
                }
            }
        }
        return true;
    }
}