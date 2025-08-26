public class RomanInt {
    static int romanToInt(String s){
        int sum=0;
        int num=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            switch (ch) {

                case 'I':
                    num=1;
                    break;
                case 'V':
                    num=5;
                    break;
                case 'X':
                    num=10;
                    break;
                case 'L':
                    num=50;
                    break;
                case 'C':
                    num=100;
                    break;
                case 'D':
                    num=500;
                    break;
                case 'M':
                    num=1000;
                    break;
                default:
                    break;
            }
            if(i<s.length()-1 && num<romanToInt(String.valueOf(s.charAt(i+1)))){
                sum-=num;
            }
            else{
                sum+=num;
            }
        }
        return sum;
    }
}
