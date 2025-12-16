public class ReverseNumber {

public static void reverseTheNumber(int n){
    String number = String.valueOf(n);
    StringBuilder newStr = new StringBuilder();
    for(int i= number.length()-1;i>=0;i--){
            newStr.append(number.charAt(i));
    }
    System.out.println(newStr);
}

    public static void main(String[] args) {
       int n = 23454;
reverseTheNumber(n);

    }
}
