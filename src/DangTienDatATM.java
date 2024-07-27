import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class DangTienDatATM {

    static int count = 0;

    // Initialize money-notes hash map
    static HashMap<Integer, Integer> moneyNotesMap = new LinkedHashMap<Integer, Integer>();
    static String result = "Withdraw: \n";

    // Method to withdraw money
    public void withdraw(int amount) {
        if (amount > 18000) {
            System.out.println("Amount is not available in ATM");
        } else if (amount <= 0) {
            System.out.println("Invalid amount!");
        } else if (amount % 100 != 0) {
            System.out.println("The amount should be a power of 100");
        } else {
            Set<Map.Entry<Integer, Integer>> moneyNotesSet = moneyNotesMap.entrySet();
            for (Map.Entry<Integer, Integer> keyValueMoneyNotes : moneyNotesSet) {

                // Check skipping condition if amount smaller than given money value
                if (amount >= keyValueMoneyNotes.getKey()) {
                    int requiredMoneyNotes = amount / keyValueMoneyNotes.getKey();
                    int usedMoneyNotes = Math.min(requiredMoneyNotes, keyValueMoneyNotes.getValue());

                    // a condition to check if money note need to dispense, then add "and"
                    if (count > 0) {
                        result = result + " and ";
                    }

                    result = result + usedMoneyNotes + " notes of " + keyValueMoneyNotes.getKey();
                    amount = amount - (usedMoneyNotes * keyValueMoneyNotes.getKey());
                    count++;
                }
            }
        }
    }

    public static void main(String[] args) {

        // Add money notes to the hash map
        moneyNotesMap.put(2000, 5);
        moneyNotesMap.put(500, 10);
        moneyNotesMap.put(200, 10);
        moneyNotesMap.put(100, 10);

        // Initialize ATM instance
        DangTienDatATM atm = new DangTienDatATM();

        // Perform withdraw
        atm.withdraw(2200);

        // Print the result
        System.out.println(result);
    }
}
