class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int[] freq = new int[nums.length + 1];
        List<List<Integer>> res = new ArrayList<>();
        for (int i : nums) {
            if (freq[i] >= res.size()) {
                res.add(new ArrayList<>());
            }
            res.get(freq[i]).add(i);
            freq[i]++;
        }
        return res;
    }
}