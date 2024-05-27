package algorithms;

public class reverse {

    public static void Change(int Num[]){
        int start = 0;
        int end = Num.length-1;

        while (start<end) {
            //  claasical code
            int temp = Num[end];
            Num[end] = Num[start];
            Num[start] = temp;

            start++;
            end--;
        
            
        }
    }
    public static void main(String[] args) {
        int Num[] = {1,2,3,4,5,6,7};
        Change(Num);

        for (int i = 0; i < Num.length; i++) {
            System.out.print(Num[i] +" ");
        }
    }
}
