package josefeus.patterns.behavioral.strategy.origin;

/**
 * @author josefeus
 * @version 1.0
 * @project designPattern
 * @date 2021/10/08 16:58
 */
public class SelectionSort implements Sort {
    @Override
    public void sort(int[] arr) {
        System.out.println("SelectionSort");
        int minIndex;
        for (int i = 0; i < arr.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
