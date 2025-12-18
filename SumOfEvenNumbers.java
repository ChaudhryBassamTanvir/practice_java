import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumOfEven=0;
        int N= sc.nextInt();

        for(int i=0;i<=N;i++){
            if (i%2==0) {
              sumOfEven+=i;
            }
        }
System.out.println("Sum of Even "+sumOfEven);



    }
}
