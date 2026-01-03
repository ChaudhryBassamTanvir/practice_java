import java.util.HashSet;

public class FindDuplicateUsingHashSet {
    public static void main(String[] args) {
        int[] nums={3,4,3,5,3,7,7,54,3,1,3};
        HashSet<Integer> seen= new HashSet<>();
        for(int n:nums){
        if (!seen.add(n)) {
        System.out.println(n +" is duplicated");                
            }
        }




    }
}
