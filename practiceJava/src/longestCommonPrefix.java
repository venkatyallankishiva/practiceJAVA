public class longestCommonPrefix {
    public static String commonPrefix(String[] s){
        String res="";
        for(int i=0;i<s.length;i++) {
            char ch = s[0].charAt(i);
            for(int j=1;j<s.length;j++){
                if(ch!=s[j].charAt(i)){
                    return res;
                }
            }
            res+=ch;
        }
    return res;
    }
}
