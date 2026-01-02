public class MajorityElements {
     public static int findMajority(int[] arr){
        int candidate =arr[0];
        int count =1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]==candidate) {
                count++;

            }else{
                count--;
            }

if (count==0) {
    candidate=arr[i];
    count=1;
    
}

}count = 0;
        for (int x : arr) {
            if (x == candidate) {
                count++;
            }
        }


if (count>(arr.length/2)) {
    return candidate;
    
}
return -1;
      
     }
    public static void main(String[] args) {
    //    Boyer-Moore Voting Algorithm
    //Time O(n) and Space O(1) 
    int[] arr = {2, 2, 1, 2, 3, 2, 2};
    System.out.println(findMajority(arr));
    }
}
