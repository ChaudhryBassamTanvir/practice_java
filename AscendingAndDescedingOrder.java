import java.util.*;

public class AscendingAndDescedingOrder {
    public static void main(String[] args) {
        Integer[] arr={2,4,7,3,8,9,5,1};
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
            Arrays.sort(arr, Collections.reverseOrder());
            System.out.println(Arrays.toString(arr));


            for (int i = 0; i < arr.length-1; i++) {
            for(int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]) {
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
            
            }
for(Integer number: arr){
    System.out.print(number+" ");
}

    }
}
