public class Prime {

    public static boolean isPrime(int n){

        if (n==2) {
            return true;
        }
        boolean isPrime = true;
        for(int i =2; i<=n ; i++){
            if (n % i == 0) {
                isPrime = false;
                break;
            }
    }
    return isPrime;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(2));
    }
}


// we can do it on optimized way but now i dont want to do it
// okey bro