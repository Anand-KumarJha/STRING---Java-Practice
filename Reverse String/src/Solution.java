class Solution {
    public char[] reverseString(char[] s) {
//         int j = s.length - 1;
//         char temp;
//         for (int i = 0; i < s.length/2; i++){
//             temp = s[j];
//             s[j] = s[i];
//             s[i] = temp;
//             j--;
//         }


        char[] s1 = new char[s.length];
        int j = 0;
        for(int i = s.length - 1; i >= 0; i--){
            s1[j] = s[i];
            j++;
        }

        j= 0;
        for(char a: s1){
            s[j] = a;
            j++;
        }

        return s;

    }
}