class Solution {
    public int lengthOfLastWord(String s) {
        String reverse1 = "";
        for(int i=s.length()-1;i>=0;i--) {
            reverse1 += s.charAt(i);
        }
        int len=0;
        String reverse2= reverse1.trim();
        for(int i=0;i< reverse2.length();i++) {
            if(reverse2.charAt(i) == ' ') {
               break;
            }
            len++;
        }
        System.out.print(reverse1);
        return len;
}
}