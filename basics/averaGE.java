import java.util.Scanner;

public class averaGE {
    public static void main(String[] args) {
        System.out.println("in this we make average of 3 numbers");
        Scanner sc = new Scanner(System.in);

        // average of 3
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = (a + b + c / 3);
        System.out.println(sum);


        // side of square
        System.out.println("its time to square");
        int a = sc.nextInt();
        int sum = (a*a);
        System.out.println(sum);


        float pencil = sc.nextFloat();
                float pen = sc.nextFloat();
                        float eraser = sc.nextFloat();
                         float sum = (pencil + pen + eraser );
                         System.out.println(sum);

                         float newTotal = sum + (0.18f * sum);
                         System.out.println(newTotal);


    }
}
