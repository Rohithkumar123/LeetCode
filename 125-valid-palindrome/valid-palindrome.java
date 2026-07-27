class Solution {
    public boolean isPalindrome(String s) {
        String st=s.toLowerCase();
        StringBuilder temp=new StringBuilder();
        for(int i=0;i<st.length();i++){
            char ch=st.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                temp.append(ch);

            }
        }
        String original=temp.toString();
        String reversed=new StringBuilder(original).reverse().toString();
        return original.equals(reversed);
    }
}