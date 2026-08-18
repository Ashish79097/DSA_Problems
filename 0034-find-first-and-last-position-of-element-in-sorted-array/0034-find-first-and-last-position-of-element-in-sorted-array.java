class Solution {
    public int[] searchRange(int[] arr, int target) {
        int low=0,hi =arr.length-1,idx1=-1;
        while(low<=hi){
            int mid = (low+hi)/2;
            if(arr[mid]>target) hi=mid-1;
            else if(arr[mid]<target) low=mid+1;
            else{
                idx1=mid;
                hi = mid-1; // for first occurence
            }
        }
        low=0;
        hi=arr.length-1;
        int idx2=-1;
        while(low<=hi){
            int mid = (low+hi)/2;
            if(arr[mid]>target) hi=mid-1;
            else if(arr[mid]<target) low=mid+1;
            else{
                idx2=mid;
                low = mid+1; // for last occurence
            }
        }
        int[] arr1 = new int[2];
        arr1[0] = idx1;
        arr1[1] = idx2;
        return arr1;
    }
}