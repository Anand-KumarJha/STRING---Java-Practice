class Solution {
    public int lengthOfLongestSubstring(String s) {
//        StringBuilder subString1 = new StringBuilder();
        int maxCount = 0;
        StringBuilder subString = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            int j = i;
            while(j < s.length()){
                if(subString.toString().indexOf(s.charAt(j)) != -1) {
                    subString.delete(0,subString.length());
                }
                subString.append(s.charAt(j));
                if(maxCount < subString.length()){
                    maxCount = subString.length();
//                    subString1.delete(0,subString.length());
//                    subString1.append(subString1);
                }
                j++;
            }
            subString.delete(0,subString.length());
        }return maxCount;
    }
}