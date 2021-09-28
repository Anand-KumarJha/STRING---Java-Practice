import java.util.ArrayList;

class Solution {
    public boolean isAnagram(String s, String t) {
        boolean isAnagram = false;
        ArrayList<Character> a = new ArrayList<>();

        if(s.length() != t.length()){
            return false;
        }

        for(int i = 0; i < t.length(); i++) {
            a.add(s.charAt(i));
        }
        for(int i = 0; i < t.length(); i++){
            int index = a.indexOf(t.charAt(i));
            if(index != -1){
                a.remove(index);
                isAnagram = true;
            }else{
                return false;
            }
        }
        return isAnagram;
    }
}