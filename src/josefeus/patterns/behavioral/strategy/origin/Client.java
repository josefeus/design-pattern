package josefeus.patterns.behavioral.strategy.origin;

import java.util.Arrays;

/**
 * @author josefeus
 * @version 1.0
 * @project designPattern
 * @date 2021/10/08 17:00
 */
public class Client {
    public static void main(String[] args) {
        int[] arr = new int[]{6, 1, 2, 3, 5, 4};
        SortImpl sort = new SortImpl(new BubbleSort());
        sort.sort(arr);
        System.out.println(Arrays.toString(arr));
        sort.setSort(new InsertSort());
        sort.sort(new int[]{6, 1, 2, 3, 5, 4});
        System.out.println(Arrays.toString(arr));
    }
}
