class Solution {
    public boolean isPalindrome(String s) {
        String string = s.toLowerCase();
        String replace = string.replaceAll("[^a-zA-Z0-9]","");
        System.out.print(replace);
        int first =0;
        int last = replace.length()-1;
        while(first<last) {
            if(replace.charAt(first) != replace.charAt(last)) {
                return false;
            }
            last--;
            first++;
    }
        return true;
    }
}