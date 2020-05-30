package Sorting;

import org.junit.Before;
import org.junit.Test;
import sorting.heapsort.HeapSort;

import static org.junit.Assert.assertArrayEquals;

public class HeapSortTest {

  private int[] arr;

  @Before
  public void setup() {
    arr = new int[] {5, 3, 2, 1, 5};
  }

  @Test
  public void test() {
    HeapSort.sort(arr);
    assertArrayEquals(new int[] {1, 2, 3, 5, 5}, arr);
  }
}
