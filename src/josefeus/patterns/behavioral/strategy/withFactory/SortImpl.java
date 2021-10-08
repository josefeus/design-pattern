package josefeus.patterns.behavioral.strategy.withFactory;

import josefeus.patterns.behavioral.strategy.origin.BubbleSort;
import josefeus.patterns.behavioral.strategy.origin.InsertSort;
import josefeus.patterns.behavioral.strategy.origin.SelectionSort;
import josefeus.patterns.behavioral.strategy.origin.Sort;

/**
 * @author josefeus
 * @version 1.0
 * @project designPattern
 * @date 2021/10/08 17:07
 */
public class SortImpl implements Sort {
    private Sort sort;

    SortImpl(SortStrategy strategy) {
        setStrategy(strategy);
    }

    @Override
    public void sort(int[] arr) {
        sort.sort(arr);
    }

    // 客户端通过此方法设置不同的策略
    public void setStrategy(SortStrategy strategy) {
        switch (strategy) {
            case BUBBLE_SORT:
                sort = new BubbleSort();
                break;
            case SELECTION_SORT:
                sort = new SelectionSort();
                break;
            case INSERT_SORT:
                sort = new InsertSort();
                break;
            default:
                throw new IllegalArgumentException("There's no such strategy yet.");
        }
    }
}
