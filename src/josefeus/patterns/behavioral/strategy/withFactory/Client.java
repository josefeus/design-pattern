package josefeus.patterns.behavioral.strategy.withFactory;

import java.util.Arrays;

/**
 * @author josefeus
 * @version 1.0
 * @project designPattern
 * @date 2021/10/08 17:08
 */
public class Client {
    public static void main(String[] args) {
        int[] arr = new int[]{6, 1, 2, 3, 5, 4};
        SortImpl sort = new SortImpl(SortStrategy.BUBBLE_SORT);
        sort.sort(arr);
        System.out.println(Arrays.toString(arr));
        sort.setStrategy(SortStrategy.INSERT_SORT);
        sort.sort(new int[]{6, 1, 2, 3, 5, 4});
        System.out.println(Arrays.toString(arr));
    }
}
