class Solution {
    public int singleNonDuplicate(int[] arr) {
       int n=arr.length;
       if(n==1) return arr[0];
       if(arr[0]!=arr[1]) return arr[0];
       if(arr[n-1]!=arr[n-2]) return arr[n-1];
       int low=0,hi=n-1;
       while(low<=hi){
        int mid=low+(hi-low)/2;
        if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]) return arr[mid];
        int f=mid, s=mid;
        if(arr[mid]==arr[mid-1]) f=mid-1;
        else s=mid+1;
        int leftcount=f-low;
        int rightcount = hi-s;
        if(leftcount%2==0) low=s+1;
        else hi=f-1;
       } 
       return 001;
    }
}