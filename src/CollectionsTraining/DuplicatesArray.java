package CollectionsTraining;

import java.util.*;

public class DuplicatesArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        Random random = new Random();
        for (int i=0; i<size; i++) {
            array[i]= random.nextInt(10);
        }
        Map<Integer, Integer> duplicatesMap = new HashMap<>();
        System.out.println(Arrays.toString(array));

        for (int i: array) {
            if (duplicatesMap.containsKey(i)) {
                int duplicateCount = duplicatesMap.get(i);
                duplicatesMap.put(i, ++duplicateCount);
            }
            else {
                duplicatesMap.put(i,0);
            }
        }

        System.out.println(duplicatesMap);

    }
}
