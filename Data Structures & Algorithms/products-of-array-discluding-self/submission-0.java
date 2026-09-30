class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] solution = new int[n];
        Arrays.fill(solution, 1);
        int cur = 1;

        for(int i = 0; i < n; i++)
        {
            solution[i] *= cur;
            cur *= nums[i];
        }
        cur = 1;
        for(int i = n-1; i>=0; i--)
        {
            solution[i] *= cur;
            cur *= nums[i];
        }

        return solution;
    }
}  
