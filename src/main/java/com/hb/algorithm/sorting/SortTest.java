package com.hb.algorithm.sorting;

import java.util.Arrays;

public class SortTest {
    public static void main(String[] args) {
        int[] data = {21, 12, 3, 54, 121, 6};
        System.out.println(Arrays.toString(data));
        BubbleSort.sort(data);
        System.out.println(Arrays.toString(data));
    }
}
