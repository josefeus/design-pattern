package josefeus.patterns.behavioral.strategy.origin;

/**
 * @author josefeus
 * @version 1.0
 * @project designPattern
 * @date 2021/10/08 16:59
 */
public class InsertSort implements Sort {
    @Override
    public void sort(int[] arr) {
        System.out.println("InsertSort");
        for (int i = 1; i < arr.length; i++) {
            int currentNumber = arr[i];
            int j = i - 1;
            while (j >= 0 && currentNumber < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = currentNumber;
        }
    }
}
