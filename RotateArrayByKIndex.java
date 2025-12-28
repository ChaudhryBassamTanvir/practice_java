public class RotateArrayByKIndex {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7};
int k=3;
 for (int i = 0; i < k; i++) {
    int temp = nums[i];
    nums[i]=nums[nums.length-1-i];
    nums[nums.length-1-i]=temp;


    
 }

for(int c:nums){
    System.out.print(c+" ");
}


    }
}
