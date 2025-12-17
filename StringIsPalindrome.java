public class StringIsPalindrome {

public static boolean  checkStringPalindrome(String str){
if(str.length()<0){
    return false;
}
String newStr="";
for(int i=str.length()-1;i>=0;i--){
    char currChar= str.charAt(i);
    newStr+=currChar;
}
if (newStr.equals(str)) {
    return true;
    
}
return false;



}

    public static void main(String[] args) {
        String str = "kayak";
System.out.println(checkStringPalindrome(str));


    }
}
