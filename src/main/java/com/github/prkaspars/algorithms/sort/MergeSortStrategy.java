package com.github.prkaspars.algorithms.sort;

public class MergeSortStrategy implements SortStrategy {

  @Override
  public int[] sort(int[] arr) {
    return sort(arr, new int[arr.length], 0, arr.length);
  }

  int[] sort(int[] arr, int[] tmp, int i, int l) {
    if (l <= 1) {
      return arr;
    }

    sort(arr, tmp, i, l / 2);
    sort(arr, tmp, i + l / 2, l - l / 2);

    return merge(arr, tmp, i, i + l / 2 - 1, i + l - 1);
  }

  int[] merge(int[] arr, int[] tmp, int l, int m, int h) {
    int i = l, j = m + 1;

    for (int k = l; k <= h; k++) {
      if (i > m) {
        tmp[k] = arr[j++];
      } else if (j > h) {
        tmp[k] = arr[i++];
      } else if (arr[i] < arr[j]) {
        tmp[k] = arr[i++];
      } else {
        tmp[k] = arr[j++];
      }
    }

    if (h + 1 - l >= 0) System.arraycopy(tmp, l, arr, l, h + 1 - l);

    return arr;
  }
}
