class Solution {
    public int[] sortedSquares(int[] nums) {
      int n=nums.length;
      int[] result=new int[n];

      int i=0;
      int j=n-1;

      for(int p=n-1;p>=0;p--){
        int leftSquare = nums[i] * nums[i];
        int rightSquare = nums[j] * nums[j];

        if(leftSquare > rightSquare){
            result[p]=leftSquare;
            i++;
        }
        else{
            result[p]=rightSquare;
            j--;
        }
      }  
      return result;
    }
}