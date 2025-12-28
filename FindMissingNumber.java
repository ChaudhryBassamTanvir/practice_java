public class FindMissingNumber {
    public static void main(String[] args) {
        int nums[]={1,2,4,5,6,7,8,9,10};
        int n=nums.length;
        int sum = (n*(n+1))/2 ;
        int sumOfArray=0;
        for (int i = 0; i < nums.length-1; i++) {
            sumOfArray+=nums[i];
        }


        System.out.println("The missing number is "+ (sum-sumOfArray));
    }
}
