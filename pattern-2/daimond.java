public class daimond {
    public static void pattern(int n ){
        // for first half

        for (int i = 1; i <=n; i++) {
            // for spaces
            for (int j = 1; j <=(n-i); j++) {
                System.out.print(" ");
            }
            // for stars
            for (int j = 1; j <=(2*i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // for second half;
        for (int i = n; i >=n; i--) {
            // for spaces
            for (int j = 1; j <=(n-i); j++) {
                System.out.print(" ");
            }
            // for stars
            for (int j = 1; j <=(2*i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(4);
    }
}
