public class Palindrome {

public static void checKPalindrome(int[] nums, int idx){
   if (idx==nums.length) {
    return;
   }
 
    
    String currValue = String.valueOf(nums[idx]);
    String newStr ="";
    for(int i=currValue.length()-1;i>=0;i--){
   
        newStr+= currValue.charAt(i);
  
}
        if (newStr.equals(currValue)) {
    System.out.println("The number "+ currValue+ " is a palindrome");
} 
 

checKPalindrome(nums, idx+1);


}

    public static void main(String[] args) {
        int nums[]= {8008,121,2321,32123,9213,23431};
        checKPalindrome(nums, 0);
    }
}
