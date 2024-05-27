public class LinearSearch {
     // function for the linear search
    public static int Check (int Numbers[], int key){

        for (int i = 0; i < Numbers.length; i++) {
            if(Numbers[i] == key){
                return i;
            }
        }
        return -1;
    }


    // main function
    public static void main(String[] args) {
        int Numbers[] = {12,23,1,5,2,33,4,};
        int key = 5;
        
        int index = Check(Numbers, key);
        if(index == -1){
            System.out.println("NOT FOUND");
        }else{
            System.out.println("key is the index:" + index);
        }
    }
}

