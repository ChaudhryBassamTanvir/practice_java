public class FibonacciSeries {
    public static void main(String[] args) {
        int num1=0;
        int num2=1;
        int n=10;


        for(int i=0;i<=n;i++){
            System.out.print(num1+" ");
            int temp = num1+num2;
            num1=num2;
            num2=temp;
        }
    }
}
