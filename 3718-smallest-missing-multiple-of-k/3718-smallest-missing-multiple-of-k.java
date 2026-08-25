class Solution {
    public int missingMultiple(int[] nums, int k) {

        Arrays.sort(nums);

        int multiple = k;

        while (true) {

            if (Arrays.binarySearch(nums, multiple) < 0) {
                return multiple;
            }

            multiple += k;
        }
    }
}