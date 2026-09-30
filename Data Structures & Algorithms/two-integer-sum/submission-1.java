class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] solution = new int[2];
        Map<Integer, Integer> result = new HashMap<>();

        for(int i = 0; i < nums.length; i++)
        {
            int needed = target - nums[i];
            if(result.containsKey(needed))
            {
                solution[0] = result.get(needed);
                solution[1] = i;
            }
            else
            {
                result.put(nums[i], i);
            }
        }

        return solution;
    }
}
