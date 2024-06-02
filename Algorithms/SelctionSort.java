package Algorithms;

// this is the second most imortant algorithsm which used
//Idea:- pick the smallest from the arrays and put in to the first

public class SelctionSort {

    public static void Selction(int arr[]){
        for (int i = 0; i < arr.length -1; i++) {
            int minPass = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minPass] > arr[j]) {
                    minPass = j;
                    
                }
            }
            int temp = arr[minPass];
            arr [minPass] = arr[i];
            arr[i] = temp;

        }
    }
    public static void main(String[] args) {
        int arr [] ={1,2,3,8,7,6,5};
        Selction(arr);
    }
}
