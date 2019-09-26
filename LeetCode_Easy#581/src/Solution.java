class Solution {
    public int findUnsortedSubarray(int[] nums) {

        int first,last;
        for (first=0;first<nums.length-1;first++){
            if(nums[first]>nums[first+1]){
                break;
            }

        }
        if(first==nums.length-1)
            return 0;
        //Whole array was sorted.

        for(last=nums.length-1;last>0;last--){
            if(nums[last]<nums[last-1]){
                break;
            }
        }

        System.out.println("first:"+first+" last:"+last);

        int min=nums[first], max=nums[first];
        for (int i=first;i<=last;i++){
            if (nums[i]>max){
                max=nums[i];
            }
            if (nums[i]<min){
                min=nums[i];
            }
        }

        System.out.println("max:"+max+" min:"+min);

        for (int i=0;i<first;i++){
            if(nums[i]>min)
                first=i;
        }

        System.out.println("first:"+first+" last:"+last);

        for(int i=nums.length-1;i>=last;i--){
            if (nums[i]<max)
                last=i;
        }

        System.out.println("first:"+first+" last:"+last);



        return (last-first)+1;

    }

    public static void main(String []args){
        int []arr={2,3,4,2,3,3,4,4};
        Solution obj=new Solution();
        int result=obj.findUnsortedSubarray(arr);
        System.out.println(result);
    }
}