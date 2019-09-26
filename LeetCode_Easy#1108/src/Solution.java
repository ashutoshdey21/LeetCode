class Solution {
    public String defangIPaddr(String address) {
        String temp="";
        for(int i=0;i<address.length();i++){
            if (!Character.isDigit(address.charAt(i))){
                temp=temp+"[.]";

            }
            else
                temp=temp+address.charAt(i);


        }
        return temp;

    }
}