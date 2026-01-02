public class RemoveSpecialCharacters {
    public static void main(String[] args) {
        String str = "as@!*hsj*hajsk";
        
        System.out.println(str.replaceAll("[@!*&^%$]",""));
    }
}
