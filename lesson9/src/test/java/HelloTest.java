import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;

import inheritance.Developer;

public class HelloTest {
  @Test
  public void testNothing() {
    System.out.println("testing nothing");

    // Assert.assertTrue(false);
    assertTrue(true);
  }

  // @Test
  // public void testNothing2() {
  //   //System.out.println("testing nothing2");
  //   boolean b = true;
  //
  //   Assert.assertTrue(b);
  // }

  @Test
  public void testDevtoString() {
    Developer dev = new Developer();

    // Assert.assertEquals(dev.toString(), "Hi, I'm developer");
    assertEquals(dev.toString(), "Hi, I'm developer");
  }

}
