class Solution {
    public int maxArea(int[] height) {

        int left=0,right=height.length-1, y_axis,x_axis,area,max_area=Integer.MIN_VALUE;
        while (left<right)
        {
            y_axis = Math.min(height[left], height[right]);
            x_axis = right-left;

            area=y_axis*x_axis;
            if(max_area<area)
                max_area=area;

            if(height[right]>height[left])
                left++;
            else right--;

        }
        return max_area;


    }

    public static void main(String []args){
        Solution obj=new Solution();
        int input[]={1,8,6,2,5,4,8,3,7};
        System.out.println(obj.maxArea(input));
    }

}