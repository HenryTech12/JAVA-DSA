//  Brute force algorithms
// max of subarays
// for the store the sum of arrays steps
// initialize 0 variable
// enter in loop
// initialized variable = +=array[]
// simple bro;



public class SumMaxSubarray {


    public static void subarays(int max[]){
         int currSum = 0;
         int MaxSum = Integer.MIN_VALUE;

        for (int i = 0; i < max.length; i++) {
            int start = i;
            for (int j = 0; j < max.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {

                    // subarrays sum
                    currSum += max[k];
                }
                System.out.println(currSum);
                    if (MaxSum < currSum) {
                        MaxSum = currSum;
                    }  
            }
        }
        System.out.println("max sum is " + MaxSum);
    }
    public static void main(String[] args) {
        int max [] = {1,2,3,4,5,6,7,8,9,};

        subarays(max);
    }
}
