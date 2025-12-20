import java.util.HashMap;

public class FrequencyOfChar {
    public static void main(String[] args) {
        String str ="asbceuiadfs";
        HashMap<Character,Integer> charCountMap = new HashMap<>();
        for(char c:str.toCharArray() ){
            if (c!=' ') {
                charCountMap.put(c, charCountMap.getOrDefault(c, 0)+1);
                
            }
        }
System.out.println("Character Frequency " + charCountMap);
      

// Count words in a sentence
String sentence = "This is java programming";
String[] words= sentence.split("\\s+");
System.out.println("the number of words in a sentence is "+words.length);

// Special sequence charater exist or not
String word="Bassam";
String existWord="Bas";
char existChar='s';

System.out.println(word.contains(existWord));
System.out.println(word.contains(String.valueOf(existChar)));




    }
}
