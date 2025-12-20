import java.util.HashSet;

class FindDuplicatesInArray{
    public static void main(String[] args) {
                                int[] arr={2,4,7,3,8,9,5,1,5};
for (int i = 0; i < arr.length; i++) {
boolean repeated=false;
    for (int j = 0; j < arr.length; j++) {
        if (i!=j && arr[i]==arr[j]) {
            repeated=true;
            break;
        }
     

    }
   if (repeated) {
        System.out.println(arr[i]);
    }
}

HashSet<Integer> seen = new HashSet<>();
for (int num : arr) {
    if (!seen.add(num)) { // .add() returns false if the item already exists
        System.out.println("Duplicate: " + num);
    }
}


    }
}