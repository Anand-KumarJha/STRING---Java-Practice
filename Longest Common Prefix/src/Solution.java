class Solution {
    public String longestCommonPrefix(String[] strs) {
        boolean equal = true;
        StringBuilder prefix = new StringBuilder();

        int minLength = Integer.MAX_VALUE;
        for (String str : strs) {
            if (str.length() < minLength) {
                minLength = str.length();
            }
        }

        for(int i = 0; i < minLength; i++){
            if(equal) {

                for(int h = 0; h < strs.length; h++) {
                    if(h != strs.length - 1 && strs[h].charAt(i) != strs[h+1].charAt(i)){
                        equal = false;
                    }
                    if(equal && h == strs.length - 1){
                        prefix.append(strs[h].charAt(i));
                    }
                }
            }
        }
        return prefix.toString();
    }
}