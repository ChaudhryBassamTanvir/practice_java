public class RemoveDuplicate {
    public static void main(String[] args) {
        // Remove duplicate characters from a string
        String str = "Bassam";
        String newStr = "";

    for(int i=0;i<str.length();i++){
        for (int j = 0; j < str.length(); j++) {
        if (i!=j && str.charAt(i)==str.charAt(j)) {
            break;            
        }            
        }
        newStr+=str.charAt(i);
    }
System.out.println(newStr);
    }
}
