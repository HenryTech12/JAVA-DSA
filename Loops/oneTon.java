import java.util.Scanner;

public class oneTon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int counter = 1;


        while (counter<= i){
            System.out.println(counter + "");
            counter++;

        }
        System.out.println(i);
    }
}
