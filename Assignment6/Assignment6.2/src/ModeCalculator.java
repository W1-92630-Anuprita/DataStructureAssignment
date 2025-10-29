import java.util.HashMap;
import java.util.Map;

public class ModeCalculator {
    public static int findMode(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int mode = arr[0];
        int maxCount = 0;

        for (int num : arr) {
            int count = frequencyMap.getOrDefault(num, 0) + 1;
            frequencyMap.put(num, count);

            if (count > maxCount) {
                maxCount = count;
                mode = num;
            }
        }

        return mode;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 2, 3, 4, 3, 5, 2, 2};
        System.out.println("Mode of the array: " + findMode(array));
    }
}
