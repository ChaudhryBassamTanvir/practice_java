// Count vowels, consonants, digits, and spaces in a string.
public class Counts {
    public static void main(String[] args) {
        int vowelCount=0;
        int consonantsCounts=0;
        int digits=0;
        int spaces=0;
        String str = "12abcdesa  ";
        for(int i=0;i<str.length()-1;i++){
            char currChar = str.charAt(i);
            if (currChar=='a' || 
            currChar=='e' ||
        currChar=='i' ||
    currChar=='o' || currChar=='u') {
                vowelCount++;
            }else if (currChar=='1' || currChar=='2' || currChar=='3' ||
             currChar=='4' ||
             currChar=='5' ||
             currChar=='6' ||
             currChar=='7' ||
             currChar=='8' ||
             currChar=='9' ||
             currChar=='0'
            ) {
                digits++;
            }else if (currChar==' ') {
                spaces++;
            }else{
                consonantsCounts++;
            }
        }
System.out.println("Vowel "+ vowelCount);
System.out.println("Consonants "+ consonantsCounts);
System.out.println("Digits "+ digits);
System.out.println("Spaces "+  spaces);

    

    }
}
