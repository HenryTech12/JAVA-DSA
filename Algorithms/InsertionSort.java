

// the third most impotant algorithm is Insertion sort algorithm
// in this basic idea is comapere with sorted and unsorted array
// place in the right position of new array
public class InsertionSort {
    
    public static void Insertion(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i=1;
            // find position

            while (prev>0 && arr[prev]>curr) {
                arr[prev +1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }
    public static void main(String[] args) {
        int arr [] ={1,2,3,8,7,6,5};
        System.out.println(InsertionSort(arr));
    }
}
