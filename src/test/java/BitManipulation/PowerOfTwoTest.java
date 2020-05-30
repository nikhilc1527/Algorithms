package BitManipulation;

import bitmanipulation.poweroftwo.PowerOfTwo;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PowerOfTwoTest {

  @Test
  public void testPowerOfTwo() {
    assertTrue(PowerOfTwo.isPowerOfTwo(4));
  }

  @Test
  public void testNonPowerOfTwo() {
    assertFalse(PowerOfTwo.isPowerOfTwo(7));
  }

  @Test
  public void testNegative() {
    assertFalse(PowerOfTwo.isPowerOfTwo(-2));
  }

  @Test
  public void testZero() {
    assertFalse(PowerOfTwo.isPowerOfTwo(0));
  }

  @Test
  public void testOne() {
    assertTrue(PowerOfTwo.isPowerOfTwo(1));
  }
}
