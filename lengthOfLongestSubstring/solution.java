class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;

        for(int i = 0; i < s.length(); i++){
            for(int j = i+1; j <= s.length(); j++){
                String subS = s.substring(i,j);

                if(isUnique(subS)) {
                    maxLength = Math.max(maxLength, subS.length());
                }                
            }
        }

        return maxLength;
    }

    public boolean isUnique(String str){
         HashSet<Character> set = new HashSet<>();
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (set.contains(c)) {
                return false;
            }
            set.add(c);
        }
        
        return true;
    }
}
