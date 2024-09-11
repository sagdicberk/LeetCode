class Solution {
    public String longestCommonPrefix(String[] strs) {
        String commonPrefix = "";
        int minLength = shortestString(strs); 

        for (int j = 0; j < minLength; j++) {
            char currentChar = strs[0].charAt(j);

            for (int i = 1; i < strs.length; i++) {
                if (strs[i].charAt(j) != currentChar) {
                    return commonPrefix;
                }
            }

            commonPrefix = commonPrefix + currentChar;
        }

        return commonPrefix;
    }

    public int shortestString(String[] strings){
        int length = strings[0].length();

        for(String s: strings){
            if(s.length() < length){
                length = s.length();

            }
        }
        return length;
    }
}
