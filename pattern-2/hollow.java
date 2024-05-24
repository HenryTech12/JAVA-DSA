public class hollow {
    public static void hello_rectangle(int trow, int tcol){
        // for outer loop which use for the boundys
        for (int i = 1; i <=trow; i++) {
            // for inner loop which run for the outsides star
            for (int j = 1; j <= tcol; j++) {
                // sell(i,J)
                if (i==1 || i==trow || j==1 || j==tcol) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hello_rectangle(3, 3);
    }
}
