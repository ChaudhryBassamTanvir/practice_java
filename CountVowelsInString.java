public class CountVowelsInString {
    public static void main(String[] args) {
        String str = "Bassamiye";
        str.toLowerCase();
        int vowel=0;
        for(int i=0;i<=str.length()-1;i++){ 
            if(str.charAt(i) == 'a' || 
    str.charAt(i) == 'e' || 
    str.charAt(i) == 'i' || 
    str.charAt(i) == 'o' || 
    str.charAt(i) == 'u')
       
       vowel++;
            }


    System.out.println(vowel);
        }

    
}
