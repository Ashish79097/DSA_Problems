class Solution {
    public int maximumCount(int[] arr) {
        int n = arr.length;
        int low=0,hi=n -1,neg=0;
        while(low<=hi){
            int mid=(low+hi)/2;
            if(arr[mid]>=0) hi = mid-1;
            else{
                neg = mid+1;
                low = mid+1;
            }
        }
        low=0;
        hi=n-1;
        int  pos =0;
        while(low<=hi){
            int mid=(low+hi)/2;
            if(arr[mid]<=0) low=mid+1;
            else{
                pos= n-mid;
                hi=mid-1;
            }
        }
        int max = Math.max(neg,pos);
        return max;
    }
}