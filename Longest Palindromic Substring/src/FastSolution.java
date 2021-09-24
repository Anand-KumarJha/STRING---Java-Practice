public class FastSolution {
    public String longestPalindrome(String s) {
        int length,len1,len2,start = 0,end = 0;

        for(int i = 0; i < s.length(); i++){
            len1 = expandAround(s,i,i);
            len2 = expandAround(s,i,i + 1);

            length = Math.max(len1,len2);

            if(length > end - start) {
                start = i - (length - 1) / 2;
                end = i + length / 2;
            }
        }

        return s.substring(start,end + 1);
    }

    public int expandAround(String s, int start, int end){
        while (0 <= start && end < s.length() && s.charAt(start) == s.charAt(end)){
            start--;
            end++;
        }
        return end - start - 1;
    }
}
