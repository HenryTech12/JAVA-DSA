

// in the binary serach find the mid of array and convert it two parts;
// and shows that which is most efficient answer;
// in this two variables available start , end index;
// and one one key is available for to find

public class BinarySerarch {

    public static int FindBinary(int ARR[], int key){
        int start = 0;
        int end = ARR.length-1;

        while (start<=end) {
            int mid= (start+end)/2;

            if (mid ==key) {
                return mid;

            }
            if (mid<key) {
                start = mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }



    public static void main(String[] args) {
        int ARR [] = {1,2,3,4,5,6,};
        int key = 10;
        FindBinary(ARR, key);
        System.out.println(FindBinary(ARR, key));
    }
}
