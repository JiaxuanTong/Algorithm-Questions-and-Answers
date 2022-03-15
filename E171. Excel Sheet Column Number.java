class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        char[] ct = columnTitle.toCharArray();
        for(int i = 0; i < ct.length; i++){
            char c = ct[i];
            int cNumber = c-'A' + 1;
            result += cNumber*(int)Math.pow(26,ct.length-i-1);
        }
        return result;
    }
}
