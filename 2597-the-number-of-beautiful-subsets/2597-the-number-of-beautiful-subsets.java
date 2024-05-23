class Solution {
    public int beautifulSubsets(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
        int res = 1, prev = 0, prevPrev = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int cur = entry.getKey();
            if (map.containsKey(cur - k)) continue;
            prev = 0;
            while (map.containsKey(cur)) {
                prevPrev = prev;
                prev = ((1 << map.get(cur)) - 1) * res;
                res += prevPrev;
                cur += k;
            }
            res += prev;
        }
        return res - 1;
    }
}