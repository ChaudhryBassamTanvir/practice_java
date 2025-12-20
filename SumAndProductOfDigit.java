public class SumAndProductOfDigit {
    public static void main(String[] args) {
        int n=1234312;
        int sum=0;
        int product=1;
        for(int i=0;i<=String.valueOf(n).length();i++){
            char currChar = String.valueOf(n).charAt(i);
            sum+= Integer.valueOf(currChar); 
        product*=Integer.valueOf(currChar);
        }

System.out.println(sum);
System.out.println(product);

    }
}
