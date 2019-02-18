package com.github.prkaspars.algorithms.sort;

public class ShellSortStrategy implements SortStrategy {

  @Override
  public int[] sort(int[] arr) {
    int t, h = 1;

    while (h < arr.length / 3) {
      h = 3 * h + 1;
    }

    while (h != 0) {
      for (int i = h; i < arr.length; i += h) {
        for (int j = i; j > 0 && arr[j] < arr[j - h]; j -= h) {
          t = arr[j - h];
          arr[j - h] = arr[j];
          arr[j] = t;
        }
      }
      h = h / 3;
    }

    return arr;
  }
}
