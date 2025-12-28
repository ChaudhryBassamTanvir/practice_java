public class MoveAllZeroToLast {
    public static void main(String[] args) {
        
        int nums[]={1,2,0,3,0,5,6,0,4,5};
        int idx=0;
        for (int i=0;i<nums.length;i++) {
            if (nums[i]!=0) {
              nums[idx]=nums[i];
              idx++;

            }
        }
        for (int i = idx; i < nums.length; i++) {
            nums[i]=0;
            
        }
        for(int n:nums){
            System.out.print(n+" ");
        }
    }
}
