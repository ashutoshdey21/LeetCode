import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class Solution {
    public String sortString(String input){

        char[] changeInput=input.toCharArray();
        Arrays.sort(changeInput);
        return Arrays.toString(changeInput);

    }

    public List<Integer> findAnagrams(String s, String p) {

        int minSize=p.length();
        List<Integer> result = null;
        Set<String> group=new HashSet<String>();
        
        return result;


    }
}
