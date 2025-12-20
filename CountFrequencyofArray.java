import java.util.HashMap;

public class CountFrequencyofArray {
    public static void main(String[] args) {
                        int[] arr={2,4,7,3,8,9,5,1,5};
        HashMap<Integer,Integer> countFrequency= new HashMap<>();
        for(int n:arr){
            countFrequency.put(n, countFrequency.getOrDefault(n, 0)+1);
        }
        System.out.println(countFrequency);
    }
}
