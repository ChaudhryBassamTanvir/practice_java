
public class PairWithGivenSum {


public static void pairGivenSum(int arr[],int sum){
    boolean found=false;
for (int i = 0; i < arr.length; i++) {
    for (int j = i+1; j < arr.length; j++) {
   if (arr[i]+arr[j]==sum) {
        
System.out.println("[ "+ i+ " , "+j+" ]");
    found=true;
    }
    
}         
}
 if (!found) {
        System.out.println("No pair found");
    }    }
    public static void main(String[] args) {
        int arr[]={1,4,2,5,2,6,7,8};
        int sum=7;
  pairGivenSum(arr, sum);
    }
}
