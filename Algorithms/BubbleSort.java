package Algorithms;


// this is the first sorting algorithm
// time complexity 0(n2)
// Idea:- Large element comes to end from swapping to each of the element.

// steps:-
//1 = loop length -1
// 2 = loop length-1-i
//swapping inside the loop

public class BubbleSort {

    public static void Bubble(int Num[]) {
        for (int i = 0; i < Num.length - 1; i++) {
            for (int j = 0; j < Num.length - 1 - i; j++) {
                if (Num[j] > Num[j + 1]) {
                    // swapping algorithm here needed
                    int temp = Num[j];
                    Num[j] = Num[j + 1];
                    Num[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int Num[] = {1, 2, 3, 4, 5, 8, 6, 9};
        
        // Calling the bubble sort method
        Bubble(Num);
        
        // Printing the sorted array
        System.out.print("Sorted array: ");
        for (int i = 0; i < Num.length; i++) {
            System.out.print(Num[i] + " ");
        }
    }
}

// note :-
// after sorting the bubble sort in this you need to make a loop
// to individally print the array