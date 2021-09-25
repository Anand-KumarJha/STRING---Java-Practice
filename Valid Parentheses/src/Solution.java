import java.util.HashMap;
import java.util.Objects;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        char pop;
        HashMap<Character, Character> bracketsPair = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        bracketsPair.put(')', '(');
        bracketsPair.put('}', '{');
        bracketsPair.put(']', '[');

        for(int i = 0; i < s.length(); i++){
            if(bracketsPair.containsKey(s.charAt(i)) && !stack.isEmpty()){
                pop = stack.pop();
                if(pop != bracketsPair.get(s.charAt(i))){
                    return false;
                }
            }else{
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();

    }
}