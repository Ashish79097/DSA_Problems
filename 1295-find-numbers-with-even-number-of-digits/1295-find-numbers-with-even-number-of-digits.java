class Solution {
    public int findNumbers(int[] arr) {
        
        int count2=0;
        for(int i=0;i<arr.length;i++){
            int count=0;
            int num = arr[i];
            while(num>0){
                num=num/10;
                count++;
            }
            if(count%2==0) count2++;
        }
        return count2;
        
        
    }
}