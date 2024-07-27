import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapStructure {

    static HashMap<Integer, Integer> hashMap = new HashMap<>();
    public static void countDuplicate(int[] array){

        for(Integer element : array){
            if(hashMap.containsKey(element)){
                hashMap.put(element, hashMap.get(element) + 1);
            }else{
                hashMap.put(element, 1);
            }
        }

        Set<Map.Entry<Integer, Integer>> entrySet =  hashMap.entrySet();
        for(Map.Entry<Integer,Integer> entry : entrySet){
            if(entry.getValue() > 1){
                System.out.println("Element: " + entry.getKey() + " - " + "Count: " + entry.getValue());
            }
        }

    }

    public static void main(String[] args) {
        int[] data = {2, 1, 3, 5, 3, 2, 5, 5, 3, 2, 2};

        // Call the method to print the counts of duplicate elements
        countDuplicate(data);
    }
}
