
import java.util.Arrays;
// Find the second largest element.

// Find the second smallest element.
public class SecondLargestAndSmallest {
    public static void main(String[] args) {
                Integer[] arr={2,4,7,3,8,9,5,1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length-2]);

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }

    for(Integer number:arr){
        System.out.print(number+" ");
    }
    System.out.println();
    System.out.print(arr[arr.length-2]);

System.out.println();
    System.out.println("Second smallest element");
    System.out.println(arr[0+1]);
    }
}
