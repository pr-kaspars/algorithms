package com.github.prkaspars.algorithms.sort;

public class QuickSortStrategy implements SortStrategy {

  @Override
  public int[] sort(int[] arr) {
    return sort(arr, 0, arr.length - 1);
  }

  public int[] sort(int[] arr, int l, int h) {
    if (l >= h) {
      return arr;
    }

    final int v = arr[l];
    int i = l, j = h + 1, t;
    while (true) {
      while (arr[++i] <= v && i != h) ;
      while (arr[--j] >= v && j != l) ;

      if (i >= j) {
        break;
      }

      t = arr[i];
      arr[i] = arr[j];
      arr[j] = t;
    }

    if (v > arr[j]) {
      arr[l] = arr[j];
      arr[j] = v;
    }

    sort(arr, l, j - 1);
    sort(arr, j + 1, h);
    return arr;
  }
}
