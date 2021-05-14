class Solution {
    public int lengthOfLongestSubstring(String s) {
 
        int max = 0;
        for(int i = 0; i < s.length() ; i++){ 
            Set<Character> uniq = new HashSet<>();
            for( int j = i; j < s.length(); j++){
                char c = s.charAt(j);
                if(uniq.contains(c)){
                    max = Math.max(max, uniq.size());
                    break;
                }else {
                        uniq.add(c);
                }
            }
             max = Math.max(max, uniq.size());
        }
        return max;
    }
}