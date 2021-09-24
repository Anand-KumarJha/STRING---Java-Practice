import java.util.Objects;

class Solution {
    public String longestPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();


        for(int j = 0; j < s.length(); j++){
            int i = j;
            sb.delete(0,sb.length());
            while(i < s.length()){
                sb.append(s.charAt(i));
                if(isPalindrome(sb.toString()) && sb.length() > sb1.length()){
                    sb1.delete(0,sb1.length());
                    sb1.append(sb);
                }
                i++;
            }
        }

        return sb1.toString();
    }

    public boolean isPalindrome(String s){
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        return Objects.equals(s, sb.toString());
    }
}