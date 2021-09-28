import java.util.HashMap;

class Solution {
    public String numberToWords(int num) {

        if(num == 0){
            return "Zero";
        }

        StringBuilder sb = new StringBuilder();
        HashMap<Integer,String> once = new HashMap<>();
        once.put(0,"");
        once.put(1,"One");
        once.put(2,"Two");
        once.put(3,"Three");
        once.put(4,"Four");
        once.put(5,"Five");
        once.put(6,"Six");
        once.put(7,"Seven");
        once.put(8,"Eight");
        once.put(9,"Nine");

        HashMap<Integer,String> ten = new HashMap<>();
        ten.put(0,"Ten");
        ten.put(1,"Eleven");
        ten.put(2,"Twelve");
        ten.put(3,"Thirteen");
        ten.put(4,"Fourteen");
        ten.put(5,"Fifteen");
        ten.put(6,"Sixteen");
        ten.put(7,"Seventeen");
        ten.put(8,"Eighteen");
        ten.put(9,"Nineteen");

        HashMap<Integer,String> tens = new HashMap<>();
        tens.put(0,"");
        tens.put(1,"Ten");
        tens.put(2,"Twenty");
        tens.put(3,"Thirty");
        tens.put(4,"Forty");
        tens.put(5,"Fifty");
        tens.put(6,"Sixty");
        tens.put(7,"Seventy");
        tens.put(8,"Eighty");
        tens.put(9,"Ninety");

        String s = num + "";
        int length = s.length();
        int digit;
        boolean previous10 = false,previous11 = false,previous12 = false;

        int l = length;
        for(int i = 0; i < length; i++){

            digit = s.charAt(i) - 48;

            if(l == 10){
                sb.append(once.get(digit)).append(" Billion ");
            }else if(l == 9){
                if(digit != 0) {
                    sb.append(once.get(digit)).append(" Hundred ");
                }
            }else if(l == 8 && digit == 1){
                previous12 = true;
                sb.append(ten.get(s.charAt(i + 1)-48)).append(" Million ");
            }else if(l == 8){
                sb.append(tens.get(digit)).append(" ");
            }else if(l == 7 && !previous12){
                if(!(digit == 0 && s.charAt(i - 1 ) == '0'&& s.charAt(i - 2) == '0')){
                    previous12 = true;
                    sb.append(once.get(digit)).append(" Million ");
                }
            }else if(l == 6){
                if(digit != 0) {
                    sb.append(once.get(digit)).append(" Hundred ");
                }
            }else if(l == 5 && digit == 1){
                previous11 = true;
                sb.append(ten.get(s.charAt(i + 1)-48)).append(" Thousand ");
            }else if(l == 5 ){
                sb.append(tens.get(digit)).append(" ");
            }else if(l == 4 && !previous11){
                if(digit == 0 && s.charAt(i - 1 ) == '0' && s.charAt(i - 2) == '0'){
                    sb.append(once.get(digit)).append(" ");
                }else {
                    sb.append(once.get(digit)).append(" Thousand ");
                }
            }else if(l == 3){
                if(digit != 0){
                    sb.append(once.get(digit)).append(" Hundred ");
                }
            }else if(l == 2 && digit == 1){
                previous10 = true;
                sb.append(ten.get(s.charAt(i + 1)-48));
            } else if(l == 2){
                if(s.charAt(i + 1)-48 == 0){
                    previous10 = true;
                    sb.append(tens.get(digit));
                }else {
                    if(digit != 0) {
                        sb.append(tens.get(digit)).append(" ");
                    }
                }
            }else if(l == 1 && !previous10){
                previous10 = true;
                sb.append(once.get(digit));
            }

            l--;
        }


        for(int i = 0; i < sb.length(); i++){
            if(i == sb.length()-1 && sb.charAt(i) == ' '){
                sb.delete(i,i+1);
            }
            if(i < sb.length()-1 && sb.charAt(i) == ' ' && sb.charAt(i + 1) == ' '){
                sb.delete(i,i+1);
                i--;
            }
        }

        return sb.toString();
    }
}