public class lengthLastValue {
    static int lastvalue(){
        String p="my name is pranav";
        String ans="";
        for(int i=p.length()-1;i>=0;i--){
            char ch=p.charAt(i);
            if(ch==' '){
                break;
            }
            ans+=ch;
        }
        return ans.length();
    }
}
