package Algorithms;

// in basically Linear search there are one key in loop which you can find and give the index
public class Linear {

    public static int FindBinary(int Num[], int key){
        for (int i = 0; i < Num.length; i++) {
            if (Num[i] == key) {
               return i; 
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int Num[] = {1,3,4,5,6,7,8,9};
        int key = 7;

       int index =  FindBinary(Num, key);
       if (index == -1) {
        System.out.println("binary not found");
       }else{
        System.out.println(index);
       }
    }
}


// this algorithms return the index