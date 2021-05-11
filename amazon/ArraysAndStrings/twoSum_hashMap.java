public class Solution { 
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> cpmt = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            cpmt.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++){
             if(cpmt.containsKey(target - nums[i]) && i != cpmt.get(target - nums[i])){
              return new int[] {i, cpmt.get(target-nums[i])}; 
            }
        }
        return new int[] {};
    }
}