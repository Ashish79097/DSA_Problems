class Solution {
    public int peakIndexInMountainArray(int[] arr) {
    int low=1;
    int  hi=arr.length-2;
    while(low<=hi){
        int mid=(low+hi)/2;
        if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) return mid;
        else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]) low=mid+1;
        else if(arr[mid]<arr[mid-1] && arr[mid]>arr[mid+1]) hi=mid-1; 
    }
    return -1;    
    }
}