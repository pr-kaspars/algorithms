package com.github.prkaspars.algorithms.sort;

public class SelectionSortStrategy implements SortStrategy {

  @Override
  public int[] sort(int[] arr) {
    final int l = arr.length;
    int a, n, t;
    for (int i = 0; i < l - 1; i++) {
      a = arr[i];
      n = -1;
      for (int j = i + 1; j < l; j++) {
        if (arr[j] < a) {
          a = arr[j];
          n = j;
        }
      }
      if (n != -1) {
        t = arr[n];
        arr[n] = arr[i];
        arr[i] = t;
      }
    }
    return arr;
  }
}
