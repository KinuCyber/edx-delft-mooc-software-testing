package tudelft.mirror;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MirrorTest {

  private Mirror mirror;

  @BeforeEach
  public void init() {
    this.mirror = new Mirror();
  }

  @Test
  public void twoLetterMirror() {
    String result = mirror.mirrorEnds("abba");
    Assertions.assertEquals("ab", result);
  }


  @Test
  public void twoLetterMirrorXYZ() {
    String result = mirror.mirrorEnds("abXYZba");
    Assertions.assertEquals("ab", result);
  }


  @Test
  public void empty() {
    String result = mirror.mirrorEnds("");
    Assertions.assertEquals("", result);
  }


  @Test
  public void noMirror() {
    String result = mirror.mirrorEnds("XYZ");
    Assertions.assertEquals("", result);
  }


  @Test
  public void noEndMirror() {
    String result = mirror.mirrorEnds("abXYZraDEFbaPQRar");
    Assertions.assertEquals("", result);
  }


  @Test
  public void oneLetterMirror() {
    String result = mirror.mirrorEnds("abXYZraDEFbaPQRra");
    Assertions.assertEquals("a", result);
  }


}
