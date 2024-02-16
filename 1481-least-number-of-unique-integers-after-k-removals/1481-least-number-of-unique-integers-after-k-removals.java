class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int[] freqCount = new int[arr.length + 1];
        for (int count : map.values()) {
            freqCount[count] += 1;
        }

        int unique = map.size();
        int freq = 1;
        while(k > 0) {
            if(k - freq * freqCount[freq] >= 0) {
                k -= freq * freqCount[freq];
                unique -= freqCount[freq];
                freq++;
            } else {
                return unique - k / freq;
            }
        }
        return unique;
    }
}