public class hollowRombus {
    // so basically this is tilted rectangle
    // so first draw spaces and hollow code
    public static void  rombo (int n ){
            for (int i = 1; i <=n; i++) {
                for (int j = 1; j <=(n-i); j++) {
                    System.out.print(" ");
                }
            for (int j = 1; j <= n; j++) {
                // sell(i,J)
                if (i==1 || i==n || j==1 || j==n) {
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
        rombo(5);
    }
}
