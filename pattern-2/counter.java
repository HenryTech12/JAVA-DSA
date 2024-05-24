

public class counter {
    public static void counterwow (int n ){
        int count = 1;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        counterwow(5);
    }
}


// outer loop i for the how many times the lopp riun
// inner loop defines the how many times the counter print
// and thw given counter will increse