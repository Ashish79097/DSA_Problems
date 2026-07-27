class Solution {
    public void sortColors(int[] arr) {
        int red=0;
        int white =0;
        int blue=0;
        int i=0;
        while(i<arr.length){
            if(arr[i]==0) red++;
            else if(arr[i]==1) white++;
            else if(arr[i]==2) blue++; 
            i++;
        }
        int j=0;
        while(red!=0){
            arr[j] = 0;
            j++;
            red--;
        }
        while(white!=0){
            arr[j] = 1;
            j++;
            white--;
        }
        while(blue!=0){
            arr[j] = 2;
            j++;
            blue--;
        }


    }
}