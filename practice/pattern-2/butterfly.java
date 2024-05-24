public class butterfly {
    public static void mainbf(int n ){
        // first half
        
        for (int i = 0; i <=n; i++) {

            //stars

            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }

            //spaces

            for (int j = 0; j<=2*(n-i); j++) {
                System.out.print(" ");
            }

            //stars

            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
System.out.println();
        }
        //second half
         
        for (int i = n; i >=1; i--) {

            //stars

            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }

            //spaces

            for (int j = 0; j<=2*(n-i); j++) {
                System.out.print(" ");
            }

            //stars

            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
System.out.println();
        }
        
    }
    public static void main(String[] args) {
        mainbf(10);
    }
}
// simple