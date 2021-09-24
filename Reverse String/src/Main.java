public class Main {
    public static void main(String[] args) {
        char[] c = new char[]{'h','e','l','l'};
        Solution solution = new Solution();
        char[] s = solution.reverseString(c);

        int j = 0;
        System.out.print("[");
        for(char i : s){
            if(j < s.length - 1) {
                System.out.print("\"" + i + "\",");
                j++;
            }else{
                System.out.print("\"" + i + "\"");
            }
        }
        System.out.print("]");
    }
}
