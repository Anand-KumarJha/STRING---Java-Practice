import java.util.List;

//Basically this solution checks every word from dictionary in small to big order, but it's also not wrong in terms of application

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        StringBuilder sa = new StringBuilder();
        sa.append(s);
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            sb.append(s.charAt(i));

            if(wordDict.contains(sb.toString())){
                if(i == 0){
                    sa.deleteCharAt(0);
                }
                sa.delete(0,i);
                sb.delete(0,sb.length());
            }
        }return sa.toString().isEmpty();
    }
}