class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += encrypt(num);
        }
        return sum;
    }
    private int encrypt(int num){
        int maxDigit = findMaxDigit(num);
        int encryptedNum = 0;
        while (num > 0) {
            encryptedNum = encryptedNum * 10 + maxDigit;
            num /= 10;
        }
        return encryptedNum;
    }
    private int findMaxDigit(int num) {
        int maxDigit = 0;
        while (num > 0) {
            int digit = num % 10;
            maxDigit = Math.max(maxDigit, digit);
            num /= 10;
        }
        return maxDigit;
    }
}