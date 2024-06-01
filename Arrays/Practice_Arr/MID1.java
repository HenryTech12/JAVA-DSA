// in this que =stion find the trappedd
// water which is stored in to the
// big  boundrys

package Arrays.Practice_Arr;

public class MID1 {

    public static int trappedRainwater(int height[]){

        int n = height.length;

        // calaculate the left max boundry
        int lm[] = new int[n];
        lm[0] = height[0];
        for (int i = 0; i <n; i++) {
            lm[i] = Math.max(height[i], lm[i-1]);
        }


        // calculate the right max boundry

            int rm[] = new int[n];
             lm[n-1]=height[n-1];
                for (int i = n-2; i >=0; i--) {
                    rm[i] = Math.max(height[i],rm[i+1]);
             }


        //loop for waterlevel (left max - right max) 

            int trappedRainwater = 0;
            for (int i = 0; i < n; i++) {
           int waterLAvel = Math.min(lm[i],rm[i]);

        // trapped water = water lavel - height

           trappedRainwater += waterLAvel-height[i];
        }
      
        return trappedRainwater;
    }
    public static void main(String[] args) {
        int height[] = {4,2,5,6,7,8,1};
       
    System.out.println( trappedRainwater(height));
    }
}
