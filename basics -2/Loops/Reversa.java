package Loops;

public class Reversa {
    public static void main(String[] args) {
        int n = 258720;
        while (n>0) {
            int lastdigit = n%10;
            System.out.println(lastdigit + "");
            n = n/10;
        }
        System.out.println();
    }
}
