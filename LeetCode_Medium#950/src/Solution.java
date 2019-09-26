/*
Somewhat understood not completely
 */
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {

        Deque<Integer> queue=new LinkedList<>();
        int[] last = new int[deck.length];
        int r=0;
        Arrays.sort(deck);
        for (int i=0;i<deck.length;i++){
            queue.add(i);
        }
        System.out.println(Arrays.toString(deck));
        System.out.println(queue);
        for(int card:deck){

            r=queue.pollFirst();
            last[r]=card;
            System.out.println("last["+r+"]="+card);
            if(!queue.isEmpty()){
                queue.addLast(queue.pollFirst());
            }
        }

        return last;

    }

    public static void main(String [] args){
        int[] a ={17,13,11,2,3,5,7};
        Solution obj=new Solution();
        int[] b =obj.deckRevealedIncreasing(a);
        System.out.println(Arrays.toString(b));
    }







}