class Solution {
    public boolean isAnagram(String s, String t) {
        int slen=s.length();
        int tlen=t.length();
        if(slen!=tlen){
            return false;
        }
        char[] str1=s.toLowerCase().toCharArray();
        char[] str2=t.toLowerCase().toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
 
        if(Arrays.equals(str1,str2)){
            return true;
        }
        return false;
    }
}
