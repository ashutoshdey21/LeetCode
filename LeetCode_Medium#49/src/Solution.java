import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> set_of_anagrams=new ArrayList<>();
        HashMap<String, List<String>> dictionary_anagrams=new HashMap<>();

        for(String current_string: strs){
            char characters[]=current_string.toCharArray();
            Arrays.sort(characters);
            String sorted_string=characters.toString();
            if(!dictionary_anagrams.containsKey(sorted_string)){
                dictionary_anagrams.put(sorted_string, new ArrayList<>());
            }
                dictionary_anagrams.get(sorted_string).add(current_string);

        }
        System.out.println(dictionary_anagrams);
        /*Iterator i=dictionary_anagrams.entrySet().iterator();
        while (i.hasNext()){

            Map.Entry mapElement = (Map.Entry)i.next();
            set_of_anagrams.add((List<String>) mapElement.getValue());

        }*/

        set_of_anagrams.addAll(dictionary_anagrams.values());


        return set_of_anagrams;


    }

    public static void main(String[] args){
        Solution obj=new Solution();
        String[] str={"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(obj.groupAnagrams(str));
    }


}