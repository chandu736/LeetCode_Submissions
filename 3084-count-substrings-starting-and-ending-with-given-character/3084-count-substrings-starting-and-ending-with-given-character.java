class Solution {
    public long countSubstrings(String s, char c) {
        long count = 0;
        int cCount = 0;
        for (char ch : s.toCharArray()) {
            if (ch == c) {
                cCount++;
            }
        }
        count = (long) cCount * (cCount + 1) / 2;
        return count;
    }
}
