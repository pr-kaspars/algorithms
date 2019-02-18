package com.github.prkaspars.algorithms.sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SelectionSortStrategyTest {
  private SelectionSortStrategy strategy;

  @BeforeEach
  void setUp() {
    strategy = new SelectionSortStrategy();
  }

  @Test
  @DisplayName("should sort empty array")
  void sortEmpty() {
    int[] result = strategy.sort(new int[0]);
    assertArrayEquals(new int[0], result);
  }

  @Test
  @DisplayName("should sort array with one element")
  void sortOne() {
    int[] result = strategy.sort(new int[]{99});
    assertArrayEquals(new int[]{99}, result);
  }

  @Test
  @DisplayName("should sort array with two element")
  void sortTwo() {
    int[] result = strategy.sort(new int[]{99, 88});
    assertArrayEquals(new int[]{88, 99}, result);
  }

  @Test
  @DisplayName("should sort array with equal element")
  void sortEqual() {
    int[] result = strategy.sort(new int[]{77, 77, 77});
    assertArrayEquals(new int[]{77, 77, 77}, result);
  }

  @Test
  @DisplayName("should sort odd length array")
  void sortOdd() {
    int[] result = strategy.sort(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1});
    assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, result);
  }

  @Test
  @DisplayName("should sort even length array")
  void sortEven() {
    int[] result = strategy.sort(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0});
    assertArrayEquals(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, result);
  }
}
