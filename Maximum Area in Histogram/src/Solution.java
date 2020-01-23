import java.util.Stack;

class Solution {
    public int maxArea(int[] height) {

        int i=0,area=0,top_height_traversed,area_max=-1;
        Stack<Integer> traversed_height=new Stack<Integer>();

        while (i<height.length){

            if(traversed_height.isEmpty() || height[traversed_height.peek()]<=height[i]){
                traversed_height.push(i);
                i++;
                //System.out.println(traversed_height);
            }
            else {

                /*System.out.println("i="+i);
                System.out.println(traversed_height);
                System.out.println("top.pop="+traversed_height.pop());*/
                top_height_traversed=traversed_height.pop();
                if (traversed_height.isEmpty()) {
                    area = height[top_height_traversed] * i-1 ;
                    //System.out.println("height="+height[top_height_traversed]+" x_axis="+(i-1));
                    /*System.out.println("1");*/

                }
                else {
                    area = height[top_height_traversed] * i - top_height_traversed-1;
                    //System.out.println("height="+height[top_height_traversed]+" x_axis="+(i - 1 - top_height_traversed));
                    /*System.out.println("2");*/

                }
                if(area_max<area)
                    area_max=area;

                //System.out.println(area);


            }

        }
        //System.out.println(traversed_height);
        while (!traversed_height.isEmpty()){

            top_height_traversed=traversed_height.pop();

            if (traversed_height.isEmpty()) {
                area = height[top_height_traversed] * i - 1 ;
                //System.out.println("height="+height[top_height_traversed]+" x_axis="+(i-1));
                /*System.out.println("1");*/

            }
            else {
                area = height[top_height_traversed] * i - top_height_traversed-1;
                //System.out.println("height="+height[top_height_traversed]+" x_axis="+(i - 1 - top_height_traversed));
                /*System.out.println("2");*/

            }

            if(area_max<area)
                area_max=area;

        }



        return area_max;

    }


    public static void main(String []args){
        Solution obj=new Solution();
        int[] input ={1,8,6,2,5,4,8,3,7};
        int result=obj.maxArea(input);
        System.out.println(result);
    }
}