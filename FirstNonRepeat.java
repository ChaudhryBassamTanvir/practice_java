public class FirstNonRepeat {
    public static void main(String[] args) {
     //Find the first non-repeating character
        String word="Bassam";

for(int i=0;i<word.length()-1;i++){
  boolean repeated= false;
for (int j = 0; j < word.length(); j++) {
 if (i!=j && word.charAt(i)==word.charAt(j)) {
    repeated=true;
    break;
    
 }  

}
if (!repeated) {
  System.out.println(word.charAt(i));  
    
 }  
}

//Capitalize the first letter of each word.
String sentence="Java is the best programming";
String[] words = sentence.split("\\s+");
for(int i=0;i<words.length;i++){
   words[i]= words[i].substring(0,1).toUpperCase()+words[i].substring(1);
   System.out.print(words[i]+" ");
}
System.out.println();
 for (String wordSentence : words) {
            System.out.print(wordSentence + " ");
        }


}
}
