package algorithms;

public class reverse {

    public static void Change(int Num[]){
        int start = 0;
        int end = Num.length-1;

        while (start<end) {
            //  claasical code
            int temp = Num[end];
            Num[end] = Num[start];
            Num[start] = temp;

            start++;
            end--;
        
            
        }
    }
    public static void main(String[] args) {
        int Num[] = {1,2,3,4,5,6,7};
        Change(Num);

        for (int i = 0; i < Num.length; i++) {
            System.out.print(Num[i] +" ");
        }
    }
}

// personally i like this code seriously 
// take arrays pass in function one variable change first and last in third
// variable and just increse and decrease the variables and void type function
//make loop and print the new array nice broo..
// basically reverse is sorting algo which can use for the initializing the var without
// change them