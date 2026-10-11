class Solution {
    public int search(int[] nums, int target) {
        return binarysearch(nums, 0, nums.length-1, target);
    }
    public int binarysearch(int[] nums, int l, int r, int target)
    {
        if(l<=r){
        int mid = l + (r-l) / 2;
        if(target<nums[mid])
        {
            return binarysearch(nums, l, mid-1, target);
        }
        else if(target>nums[mid])
        {
            return binarysearch(nums, mid+1, r, target);
        }
        else if(target == nums[mid])
        {
            return mid;
        }
        return -1;
    }
    else{
        return -1;
    }
}
}
