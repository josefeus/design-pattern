package josefeus.patterns.behavioral.strategy.origin;

/**
 * @author josefeus
 * @version 1.0
 * @project designPattern
 * @date 2021/10/08 16:58
 */
public class BubbleSort implements Sort {
    @Override
    public void sort(int[] arr) {
        System.out.println("BubbleSort");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 如果左边的数大于右边的数，则交换，保证右边的数字最大
                    arr[j + 1] = arr[j + 1] + arr[j];
                    arr[j] = arr[j + 1] - arr[j];
                    arr[j + 1] = arr[j + 1] - arr[j];
                }
            }
        }
    }
}
