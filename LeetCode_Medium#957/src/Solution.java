import java.util.Arrays;

class Solution {
    public int[] prisonAfterNDays(int[] cells, int N) {

        int []ansr=new int[cells.length];

        ansr[0]=0;
        ansr[ansr.length-1]=0;
        N=(N%14);
        if(N==0)N=14;
        /*There is a repetition after 14 occurrences.*/


        for (int x=0;x<N;x++){
            System.out.println(Arrays.toString(cells));
            for(int i=1;i<cells.length-1;i++)
            {
                if(cells[i-1]==cells[i+1]){
                    ansr[i]=1;
                }else {
                    ansr[i]=0;
                }
            }
            cells=ansr.clone();

            
        }

        return cells;

    }

    public static void main(String [] args){
        Solution obj=new Solution();
        int [] input={0,1,0,1,1,0,0,1};
        //System.out.println(Arrays.toString(input));
        input=obj.prisonAfterNDays(input,14);
        //System.out.println(Arrays.toString(input));

    }
}