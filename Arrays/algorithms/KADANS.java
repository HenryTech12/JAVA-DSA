public class KADANS {

    public static void Kadans(int Num[]){
            int ms = Integer.MIN_VALUE;
            int cs = 0;

            for (int index = 0; index < Num.length; index++) {
                cs = cs + Num[index];

                if (cs <0) {
                    cs =0;
                }
                ms = Math.max(cs, ms);
            }
            System.out.println("our max sum is " + ms);
    }
    public static void main(String[] args) {
        int Num [] = {1,-2,3,-4,9,7};
        Kadans(Num);
    }
}
