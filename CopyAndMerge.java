import java.util.Arrays;
import java.util.stream.IntStream;

public class CopyAndMerge {
    public static void main(String[] args) {
                int[] arr={2,4,7,3,8,9,5,1};
                int[] arr2={10,11,4,6,7,88,51,19};
                int[] arrB=arr.clone();
                System.out.println(Arrays.toString(arrB));
                            int[] arrC=Arrays.copyOf(arr,arr.length);
System.out.println(Arrays.toString(arrC));

int merged[]=new int[arr.length+arr2.length];
System.arraycopy(arr, 0, merged, 0, arr.length);
System.arraycopy(arr2, 0, merged, arr.length, arr2.length);
System.out.println(Arrays.toString(merged));
    
int[] concatMerged = IntStream.concat(Arrays.stream(arr), Arrays.stream(arr2)).toArray();

System.out.println(Arrays.toString(concatMerged));



    }
}
