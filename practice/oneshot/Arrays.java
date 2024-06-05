package practice.oneshot;

import algorithms.reverse;

public class Arrays {

//1- for the find the max or big element;

 public static int Max(int Num[]){
    int max= Num[0];
    for (int i = 1; i < Num.length; i++) {
        if (Num[i]> max) {
            max=Num[i];
        }
    }
    return max;
 }

 //2- for find the min member is array
 
 public static int Min(int Num[]){
    int min= Num[0];
    for (int i = 1; i < Num.length; i++) {
        if (Num[i]< min) {
            min=Num[i];
        }
    }
    return min;
 }


 //3 - summ of the array
  public static int Sum(int Num[]){
    int sum = 0;
    for (int i = 0; i < Num.length; i++) {
        sum +=Num[i];
    }
    return sum;
  }

  // 4- average of an array
   public static double Avrage(int Num[]){
    int sum = 0;
    for (int i = 0; i < Num.length; i++) {
        sum +=Num[i];
    }

    return (double) sum/Num.length;
  }

  // 5- Reverse of an array 
  // in this using the swapping functionality


  public static void Reverse( int Num[]){
    int start =0;
    int end = Num.length-1;
    while (start < end) {
        int temp = Num[start];
        Num[start]= Num[end];
        Num[end]=temp;

        start++;
        end--;

       
    }
  }





    public static void main(String[] args) {
          int Num[] = {1,2,3,4,5,6,7,8,9};

         
          System.out.println( "maximum number is :" + Max(Num));
          System.out.println( "minimum number is :" + Min(Num));
           System.out.println( "arrays of sum number is :" + Sum(Num));
           System.out.println( "average of an arrays is:" + Avrage(Num));
        //    Reverse(Num);
        //    System.out.println(Arrays.toString(Num));
          
    }
  

}
