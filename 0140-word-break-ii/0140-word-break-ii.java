class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        List<String> result = new ArrayList<>();
        backtrack(s, wordSet, new StringBuilder(), result, 0);
        return result;
    }
    private static void backtrack(String s, Set<String> wordSet, StringBuilder curr, List<String> result,
            int start) {
        if (start == s.length()) {
            result.add(curr.toString().trim());
            return;
        }

        for (int end = start + 1; end <= s.length(); end++) {
            String word = s.substring(start, end);
            if (wordSet.contains(word)) {
                int currLength = curr.length();
                curr.append(word).append(" ");
                backtrack(s, wordSet, curr, result, end);
                curr.setLength(currLength);
            }
        }
    }
}