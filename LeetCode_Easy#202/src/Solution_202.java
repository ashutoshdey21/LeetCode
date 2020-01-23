class Solution_202 {
    public boolean isHappy(int n) {
        if (n == 1) return true;
        else if (n < 10) return false;
        else {
            n = digitSquareSum(n);
            return isHappy(n);
        }
    }

    private int digitSquareSum(int n) {
        int sum = 0, digit;
        while (n != 0) {
            digit = n % 10;
            sum = sum + (digit * digit);
            n = n / 10;
        }
        return sum;
    }


    public static void main(String[] args) {
        Solution_202 obj = new Solution_202();
        System.out.println(obj.isHappy(100));
    }
}