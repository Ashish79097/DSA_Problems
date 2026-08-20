class Solution {
    int search(int[] arr, int key) {
        
        int low=0,hi=arr.length-1;
        while(low<=hi){
            int mid= low+(hi-low)/2;
            if(arr[mid]==key) return mid;
            else if(arr[low]<=arr[mid]){
                if(key>=arr[low] && key<arr[mid]) hi=mid-1;
                else low=mid+1;
            }
            else{
                if(key>arr[mid] && key<=arr[hi]) low=mid+1;
                else hi = mid-1;
            }
        }
        return -1;
    }
}