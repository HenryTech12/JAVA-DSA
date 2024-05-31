package algorithms;

public class BinarySearch {
    public static int search(int Num[], int key){
        int start = 0;
        int end = Num.length - 1;
        
        while (start <= end) {
            int mid = (start + end)/2;

            if (Num[mid] == key) {
                return mid;
            }
            if (Num[mid] < key){
                start = mid+1;
            }else{
                start = mid-1;
            }
        }
        return-1;
    }
    public static void main(String[] args) {
        int Num [] = {1,2,3,4,5,6,7,8,9,10, 11};
        int key = 11;

        System.out.println("the indexof binary search is " + search(Num, key));
    }
}
