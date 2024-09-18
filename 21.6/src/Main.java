import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MostFrequentNumbers.main(args);
    }
}

class MostFrequentNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> occurrences = new HashMap<>();

        System.out.println("Enter integers (0 to stop):");


        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break; // end loop when 0 is entered
            }
            occurrences.put(number, occurrences.getOrDefault(number, 0) + 1);
        }

        // Find maximum occurrence count
        int maxCount = 0;
        for (int count : occurrences.values()) {
            if (count > maxCount) {
                maxCount = count;
            }
        }


        List<Integer> mostFrequentNumbers = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            if (entry.getValue() == maxCount) {
                mostFrequentNumbers.add(entry.getKey());
            }
        }

        // Output the result
        System.out.println("Number(s) with the most occurrences: " + mostFrequentNumbers);
        scanner.close();
    }
}
