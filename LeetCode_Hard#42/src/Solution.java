import java.util.Queue;
import java.util.Stack;

class Solution {
    public int trap(int[] height) {

        Stack<Integer> traversed_height=new Stack<Integer>();

        int i=0,total_water,top_height_traversed,area,sum=0;
        while (i<height.length){

            if(traversed_height.isEmpty()||height[traversed_height.peek()]>height[i])
            {
                traversed_height.add(i);

                i++;
            }
            else {
                System.out.println(traversed_height);
                while (!traversed_height.isEmpty() && height[i]>height[traversed_height.peek()])
                {
                    //System.out.println(traversed_height.pop());
                    sum=sum+height[traversed_height.pop()];

                }
                System.out.println(sum);

                //sum=sum+height[traversed_height.pop()];
                break;



                /*System.out.println(i);
                top_height_traversed=traversed_height.pop();
                area=height[top_height_traversed]*/



            }


        }

        return 0;

    }



    public static void main(String []args){
        Solution obj=new Solution();
        int input[]={0,1,0,2,1,0,1,3,2,1,2,1};
        int result=obj.trap(input);
        //System.out.println(result);
    }
}