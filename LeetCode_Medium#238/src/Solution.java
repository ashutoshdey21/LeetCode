import java.util.Arrays;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] output=new int[nums.length];
        int multiple=1;
        for (int i=nums.length-1;i>=0;i--){
            output[i]=multiple;
            multiple=multiple*nums[i];

        }
        multiple=1;
        for (int i=0;i<nums.length;i++){
            output[i]=output[i]*multiple;
            multiple=multiple*nums[i];
        }


        return output;

    }
    public static void main(String []args){
        Solution obj=new Solution();
        int [] input={1,2,9,0};
        System.out.println(Arrays.toString(obj.productExceptSelf(input)));
    }
}