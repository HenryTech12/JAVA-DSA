package Arrays.Practice_Arr;

public class MID2 {

    public static int Stock(int Prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int MaxProfir = 0;
        
        for (int i = 0; i < Prices.length; i++) {
            if (buyPrice<Prices[i]){// profit
                int profit = Prices[i] - buyPrice;// todays profit
                MaxProfir = Math.max(MaxProfir,profit);
            } else{
                buyPrice = Prices[i];
            }
        }
        return MaxProfir;
    }
    public static void main(String[] args) {
        int Prices[] = {7,1,5,3,6,4};
        System.out.println(Stock(Prices));
    }
}


// base lavel logic can be done
// but realizing that you should done the dry run.