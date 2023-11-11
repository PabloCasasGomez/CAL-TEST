package es.upo.cal;

import org.testng.Assert;
import org.testng.annotations.Test;

public class pruebaInteger {
  @Test
  public void testMaxValue() {
      Assert.assertEquals(Integer.MAX_VALUE, 2147483647);
  }

  @Test
  public void testMinValue() {
      Assert.assertEquals(Integer.MIN_VALUE, -2147483648);
  }

  @Test
  public void testParseInt() {
      Assert.assertEquals(Integer.parseInt("123"), 123);
  }

  @Test(expectedExceptions = NumberFormatException.class)
  public void testParseIntWithException() {
      Integer.parseInt("abc");
  }
}
