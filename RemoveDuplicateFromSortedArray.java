
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int arr[] = {3,1,5,8,5,3,6,5,8,6};
        Arrays.sort(arr);

    HashSet<Integer> hashset = new HashSet<>();
    for(int c:arr){
        if (!hashset.contains(c)) {
            hashset.add(c);
        }
    }
    System.out.println(hashset);
    }
}
