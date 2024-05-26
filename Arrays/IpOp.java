import java.util.Scanner;

public class IpOp {
    // This code for input output of java

    // for the input
    public static void main(String[] args) {
        
         int Marks[] = new int [100];

        Scanner sc = new Scanner(System.in);
        Marks[0] = sc.nextInt();// phy
         Marks[1] = sc.nextInt();// che
          Marks[2] = sc.nextInt();// mat

 // for the output

            System.out.println("phy :" +Marks[0]);
            System.out.println("che :" +Marks[1]);
            System.out.println("mat :" +Marks[2]);

 // for th average of AN ARRAY
            int count = (Marks[0] + Marks[1]  + Marks[2])/3;
            System.out.println(count);
    }
}
