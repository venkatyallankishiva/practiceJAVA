public class RemoveSpaces {
    static String remove(String s){
        String result=" ";
        String word=" ";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==' '){
                if(s.charAt(i+1)!=' '){
                    result+=word+" ";
                    word="";
                }
                else{
                    result+=word;
                    word="";
                }
            }
            else{
                word=word+ch;
            }
        }
        result+=word;
        return result.trim();
    }
}
