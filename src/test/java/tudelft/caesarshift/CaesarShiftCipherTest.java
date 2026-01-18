package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {

  @Test 
  public void test1() {
    CaesarShiftCipher cipher = new CaesarShiftCipher();
    Assertions.assertEquals("abbccd", cipher.encrypt("abc",1));
  }
}
