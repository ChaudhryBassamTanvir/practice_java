public class ArrayProblems {
    public static void main(String[] args) {
        int[] arr= {2,8,5,3,5,7,1};
        int max=arr[0];
        int min=arr[0];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]<min) {
                    min=arr[i];
                
            }
            if (arr[i]>max) {
                max=arr[i];
                
            }
            sum+=arr[i];
        }
System.out.println("The minimum number is "+ min);
System.out.println("The maximum number is "+ max);
System.out.println("The sum is "+ sum);
        
    }
}
