import java.util.HashSet;

public class HashSetStructure {

    // Create a hashset with capacity is 16, and load factor is 0.75
    static HashSet<Integer> hashSet = new HashSet<>();


    public static void main(String[] args) {

        // Initiate an array
        int[] data = {2, 1, 3, 5, 3, 2};
        int firstDuplicate = findDuplicate(data);
        System.out.println("First duplicate element: " + firstDuplicate);

    }

    public static int findDuplicate(int[] array){
        // Loop to access each element in array
        for (int element : array){
            if(hashSet.contains(element)){
                return element;
            }
            hashSet.add(element);
        }
        return -1;
    }
}
