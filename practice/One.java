public class One {

    // for the sum
    public static int Count(int a , int b){
        return a+b;
    }




    public static void main(String[] args) {
      int c =   Count(12, 13);
        System.out.println(Count(12, 12));
        System.out.println(c);
            // 1.0 stars
            // in this loop print the star pattern with loop first you can seet the how many time the
            // loops run and that times gives them the variable to run the loop
            System.out.println(" this is the first ansewr");

        int n = 4;
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j<=i; j++) {
                System.out.print("*");
            }
             System.out.println();
        }
        System.out.println("this is the second answer");

        // revrse stars i this first print spacs and then strs
            int length = 5;
         for (int i = 0; i <= length; i++) {
            for (int j = 0; j < length-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
             System.out.println();
       
         }
        System.out.println("this is the third answer");


         // floyds triangle
         // make  a paramyid of the number in incresing order
         int h = 5;
         int counter = 0;
         for (int i = 0; i <=5; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(counter);
                counter++;
            }
            System.out.println();
         }
         System.out.println("so this is the fourths answer");



         // its time for the butterfly pattern
         

    }



}
