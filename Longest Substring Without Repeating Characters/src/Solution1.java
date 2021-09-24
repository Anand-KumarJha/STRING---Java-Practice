import java.util.HashMap;

public class Solution1 {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>hashMap = new HashMap<>();
        int answer = 0;

        for(int i = 0, j = 0; j < s.length(); j++){
            if(hashMap.containsKey(s.charAt(j))){
                //s.charAt(j) is storing j+1 (means next index) in hashmap, so here we're directly using it.
                i = Math.max(i, hashMap.get(s.charAt(j)));
            }
            answer = Math.max(answer,j - i + 1);
            hashMap.put(s.charAt(j), j + 1);
        }
        return answer;
    }
}
