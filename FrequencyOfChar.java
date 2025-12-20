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
        
    }
}
