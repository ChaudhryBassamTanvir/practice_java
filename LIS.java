public class LIS {

    public static int longestIncreasingSubsequence(int[] arr){
        int n= arr.length;


        int[] dp = new int[n];
 for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j <i; j++) {
                if (arr[i]>arr[j]) {
                    dp[i]=Math.max(arr[i], arr[j]+1);
                }
            }
        }

  int max = dp[0];
        for (int i = 1; i < n; i++) {
            if (dp[i] > max) {
                max = dp[i];
            }
        }

        return max;



    }
    public static void main(String[] args) {
                int[] arr = {3, 10, 2, 1, 20};
System.out.println(longestIncreasingSubsequence(arr));
    }
}
