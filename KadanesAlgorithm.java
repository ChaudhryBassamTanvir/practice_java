public class KadanesAlgorithm {

    public static int maxSubArraySum(int[] arr){
        if (arr==null || arr.length==0) {
            return 0;
        }
        int maxSum =arr[0];
        int currSum=arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            currSum=Math.max(arr[i], currSum+arr[i]);
            maxSum=Math.max(maxSum, currSum);
        }
return maxSum;
    }
    public static void main(String[] args) {
            int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
            System.out.println("Maximum subarray sum for nums1: " + maxSubArraySum(nums1)); // Output: 6

    }
}
