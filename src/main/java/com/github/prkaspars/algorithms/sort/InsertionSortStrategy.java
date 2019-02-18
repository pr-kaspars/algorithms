package com.github.prkaspars.algorithms.sort;

public class InsertionSortStrategy implements SortStrategy {

  @Override
  public int[] sort(int[] arr) {
    int t;
    for (int i = 1; i < arr.length; i++) {
      for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
        t = arr[j - 1];
        arr[j - 1] = arr[j];
        arr[j] = t;
      }
    }
    return arr;
  }
}
