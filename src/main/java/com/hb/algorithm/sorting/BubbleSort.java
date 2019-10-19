package com.hb.algorithm.sorting;

class BubbleSort {
    static void sort(int[] data) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < data.length - 1; i++) {
                if (data[i] > data[i + 1]) {
                    int temp = data[i + 1];
                    data[i + 1] = data[i];
                    data[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}
