public class Factorial {

 
    
    public static int calFactorial(int n){
        if(n==0 || n==1){
            return 1;
        }

        return n*calFactorial(n-1);




    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(calFactorial(n));
    }
}
