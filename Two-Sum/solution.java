class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] listOfIndex = new int[2];
        
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
               int optionalTarget = nums[i] + nums[j];
               if(target == optionalTarget){
                 if(i != j){
                    listOfIndex[0] = i;
                    listOfIndex[1] = j;
                    return listOfIndex;
                 }
                 
               }
            }
        }
        return listOfIndex;
    }
}
