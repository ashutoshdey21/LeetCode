import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {

        ArrayList result=new ArrayList();

        StringBuilder token = new StringBuilder();
        for (int i=0;i<S.length();++i){


            if((i==S.length()-1 ) || S.charAt(i)!=S.charAt(i+1)){

                token.append(S.charAt(i));
                //System.out.println(token);
                if(token.length()>=3){

                    result.add(Arrays.asList((i+1)-token.length(),i));
                }

                token = new StringBuilder();





            }else {
                token.append(S.charAt(i));
            }
        }


        return result;

    }

    public static void main(String []args){
        String input="hjjjjj";
        Solution obj=new Solution();
        List<List<Integer>> result=obj.largeGroupPositions(input);
        System.out.println(result);
    }
}