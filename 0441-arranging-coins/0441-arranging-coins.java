class Solution {
    public int sqrt(long n) {
        long low = 1, hi = n;
        if (n == 0)
            return 0;
        while (low <= hi) {
            long mid = low + (hi - low) / 2;
            if (mid == n / mid) { // mid*mid==n is written as mid==n/mid
                return (int)mid;
            } else if (mid > n / mid) {// mid*mid>n is written as mid>n/mid
                hi = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return(int)hi;
    }

    public int arrangeCoins(int n) {
        long m = (long) n;
        return (sqrt(8*m+1)-1)/2;

    }
}