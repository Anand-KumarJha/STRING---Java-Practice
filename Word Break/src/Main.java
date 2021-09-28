import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "aaaaaaa";
        List<String> wordDict = new ArrayList<String>();
        wordDict.add("aaaa");
        wordDict.add("aa");

        CorrectSolution correctSolution = new CorrectSolution();
        System.out.println(CorrectSolution.wordBreak(s,wordDict));

        System.out.println(solution.wordBreak(s,wordDict));
    }
}
