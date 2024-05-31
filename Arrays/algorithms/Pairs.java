package algorithms;

public class Pairs {


    public static void pairing(int Num[]){
        int ts = 0;
        for (int i = 0; i < Num.length; i++) {
            int start = i;
            for (int j = i; j < Num.length; j++) {
                int end = j;
                for (int k = start; k <=end; k++) {
                    System.out.print(Num[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarrays " + ts);
    }


    public static void main(String[] args) {
        int Num [] ={1,2,3,4,5,6,7,8,9,};
        pairing(Num);
    }
}

