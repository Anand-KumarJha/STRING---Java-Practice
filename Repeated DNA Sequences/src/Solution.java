import java.util.*;

class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Map<String,Integer> dna = new HashMap<>();
        List<String> returns = new ArrayList<>();
        String a;

        for(int i = 0; i < s.length() - 9; i++){
            a = s.substring(i, i+10);
            if(dna.containsKey(a)){
                dna.put(a,dna.get(a) + 1);
            }else{
                dna.put(a,0);
            }
        }

        for(Map.Entry<String,Integer> x: dna.entrySet()){
            if(!x.getValue().equals(0)){
                returns.add(x.getKey());
            }
        }

        return returns;
    }
}