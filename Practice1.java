public class Practice1 {
    public static void main(String[] args) {
        int[] nums= {3,9,5,10,6};
      int max=0;
        for (int i = 0; i <nums.length-1; i++) {
            if (nums[i]<nums[i+1] ) {
                max=nums[i+1];
            }

        }
System.out.println(max);


    }
}
