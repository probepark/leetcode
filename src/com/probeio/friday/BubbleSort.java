package com.probeio.friday;

class BubbleSort {
    public int[] bubbleSort(int[] arr) {
        int arrLen = arr.length - 1; // last unsorted
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arrLen; i++) {
                if (arr[i] > arr[i + 1]) {
                    System.err.println(arr[i]);
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    isSorted = false;
                }
            }
            arrLen--;
        }
        return arr;
    }
}