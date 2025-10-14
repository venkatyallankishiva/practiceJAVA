import java.util.HashMap;

public class stringFreqCount{
    public  static void freqCount(){

        HashMap<Character, Integer> freq = new HashMap<>();

       String s="pranav yadav";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (freq.containsKey(ch)) {
                int Count = freq.get(ch);
                freq.put(ch, Count + 1);
            }
            else {
                freq.put(ch, 1);
            }
        }

        System.out.println(freq);
    }
}
