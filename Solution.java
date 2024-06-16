class Solution {
    public int numEquivDominoPairs(int[][] nums) {
        int out = 0;

        for(int i=0; i<nums.length-1; i++){
            int a = nums[i][0];
            int b = nums[i][1];

            for(int j=i+1; j<nums.length; j++){
                int c = nums[j][0];
                int d = nums[j][1];

                if((a==c && b==d) || (a==d && b==c)){
                    out++;
                }
            }
        }
        return out;
    }
}
