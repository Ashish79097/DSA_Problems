class Solution {
    public int mySqrt(int n) {
        int low=1,hi=n;
        if(n==0) return 0;
        while(low<=hi){
            int mid=low+(hi-low)/2;
            if(mid==n/mid){ // mid*mid==n is written as mid==n/mid
                return mid;
            }
            else if(mid>n/mid){// mid*mid>n is written as mid>n/mid
                hi=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return hi;
    }
}