package algorithms;

public class largest {

    public static int getLargest(int Numbers[]){
            int largest = Integer.MIN_VALUE; // minus value is this

            for (int i = 0; i < Numbers.length; i++) {
                if (largest < Numbers[i]) {
                    largest = Numbers[i];
                }
            }
            return largest;
    }
    public static void main(String[] args) {
        int Numbers[] = {1,2,3,4,5};

        System.out.println("largest value is:" + getLargest(Numbers));
    }
}
