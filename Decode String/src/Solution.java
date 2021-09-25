import java.util.*;
class Solution {
    public String decodeString(String s) {
        Stack<String> stringStack = new Stack<>();
        Stack<Integer> numStack = new Stack<>();

        StringBuilder sb = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        int check;

        for(int i = 0; i < s.length(); i++){
            try{
                check = Integer.parseInt(s.charAt(i) + "");
                while(Character.isDigit(s.charAt(i + 1))){
                    check = check * 10 + Integer.parseInt(s.charAt(i + 1) + "");
                    i++;
                }
            }catch (NumberFormatException e){
                check = -1;
            }
            if(check != -1){
                numStack.push(check);
            }else if(Objects.equals(s.charAt(i),'[')){
                stringStack.push(sb.toString());
                sb.delete(0,sb.length());
            }else if(Objects.equals(s.charAt(i),']')){
                temp.append(stringStack.pop());

                int l = numStack.pop();
                temp.append(sb.toString().repeat(l));

                sb.delete(0,sb.length());
                sb.append(temp);
                temp.delete(0,temp.length());
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();

    }
}