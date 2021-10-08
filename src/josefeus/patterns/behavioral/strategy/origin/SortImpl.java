package josefeus.patterns.behavioral.strategy.origin;

/**
 * @author josefeus
 * @version 1.0
 * @project designPattern
 * @date 2021/10/08 16:59
 */
public class SortImpl implements Sort {
    private Sort sort;

    public SortImpl(Sort sort) {
        this.sort = sort;
    }

    @Override
    public void sort(int[] arr) {
        sort.sort(arr);
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }
}
