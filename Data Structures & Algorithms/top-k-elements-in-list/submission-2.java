class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(k == nums.length)
        {
            return nums;
        }
        Map<Integer, Integer> result = new HashMap<>();

        for(int n : nums)
        {
            result.put(n, result.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(
            (a, b) -> Integer.compare(result.get(a), result.get(b))
        );

        for(int i : result.keySet())
        {
            minHeap.offer(i);

            if(minHeap.size() > k)
            {
                minHeap.poll();
            }
        }

        int[] ans = new int[k];
        for(int i = 0; i < k; i++)
        {
            ans[i] = minHeap.poll();
        }

        return ans;
    }
}
