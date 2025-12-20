public class MethodsQuestions {

    public static boolean isPrime(int n){
        if (n==1 || n==2) {
            return true;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n%i==0) {
                return false;
            }
            
        }
        return true;
    }

public static int findfactorial(int n,int idx){
    if (n==0) {
        return 0;
    }

    if (n==1) {
        return 1;
    }
    return n*findfactorial(n-1,idx+1);
}

public static void reverseNumber(int number){
    String num = String.valueOf(number);
  String reversedStringOfNumber= new StringBuilder(num).reverse().toString();
  System.out.println(reversedStringOfNumber); 

}

public static double calPower(int a, int b){
    return Math.pow(a, b);
}

    public static void main(String[] args) {
//         Create a method to check prime number.
// Create a method to find factorial.
// Create a method to reverse a number.
// Create a method to find maximum of two numbers.
// Create a method to calculate power (a^b).     
System.out.println(isPrime(36));
int n=5;
System.out.println(findfactorial(n, 0));
reverseNumber(12213423);

System.out.println(calPower(2, 3)
);}
}
