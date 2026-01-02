import java.util.HashMap;

public class CompressString {
    public static void main(String[] args) {
        String str="aaabccd";
HashMap<Character,Integer> hashmap= new HashMap<>();
for (int i = 0; i < str.length()-1; i++) {
char c = str.charAt(i);
if (hashmap.containsKey(c)) {
    hashmap.put(c, hashmap.get(c)+1);
}else{
    hashmap.put(c, 1);
}
    
}

StringBuilder compressed = new StringBuilder();

for(HashMap.Entry<Character,Integer> entry:hashmap.entrySet()){
compressed.append(entry.getKey()).append(entry.getValue());
}
System.out.println(compressed);
    }
}
