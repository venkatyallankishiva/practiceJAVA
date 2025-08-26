public class anagram {
    static boolean anagram(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        for(int i=0;i<str1.length();i++){
            String ans="";
            char ch=str1.charAt(i);
            ans=ans+ch;
            if(str2.contains(ans)){
                str2=str2.replaceFirst(ans,"");
            }else{
                return false;
            }
        }
        return str2.isEmpty();
    }
}
