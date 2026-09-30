class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();

        for(String s : strs)
        {
            char[] sArr = s.toCharArray();
            Arrays.sort(sArr);
            String key = new String(sArr);

            if(!result.containsKey(key))
            {
                result.put(key, new ArrayList<>());
            }
            result.get(key).add(s);
        } 

        return new ArrayList<>(result.values());
    }
}
