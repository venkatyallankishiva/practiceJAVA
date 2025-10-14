public class lossProfit {
    public static String cal(){
        int profit=0;
        int loss=0;
        int sp=2000;
        int cp=1500;
        if(sp>cp) {
            profit = sp = cp;
            return "loss=" + "" + profit;
        }
        return "No loss no profit";
    }
}
