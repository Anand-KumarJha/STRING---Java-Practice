class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        boolean isEmpty = true;
        for(int i = arr.length - 1; i >= 0; i-- ) {
            if(arr[i].isBlank()){
                //nothing
            }
            else{
                if(!isEmpty) {
                    stringBuilder.append(' ').append(arr[i]);
                }else{
                    stringBuilder.append(arr[i]);
                    isEmpty = false;
                }
            }
        }
        return stringBuilder.toString();
    }
}