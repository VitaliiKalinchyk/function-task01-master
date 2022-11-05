package com.epam.rd.autotasks;


import java.util.Arrays;
import java.util.Comparator;

class FunctionsTask1 {
    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     * if set invalid arguments in method, then method must throws
     * IllegalArgumentException
     */
    public static boolean isSorted(int[] array, SortOrder order) {
        if (array == null || array.length == 0 || order == null) {
            throw new IllegalArgumentException();
        }
        Comparator<Integer> comparator = null;
        if (order == SortOrder.ASC) {
            comparator = Comparator.naturalOrder();
        } else if (order == SortOrder.DESC) {
            comparator = Comparator.reverseOrder();
        }
        int[] ints = Arrays.stream(array).boxed().sorted(comparator).mapToInt(Integer::valueOf).toArray();
        return Arrays.equals(array, ints);
    }
}