package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TwoNumbersSumTest {

  private TwoNumbersSum tns;
  ArrayList<Integer> a;
  ArrayList<Integer> b;
  ArrayList<Integer> c;
  
  @BeforeEach
  public void initialized() {
    a = new ArrayList<>();
    b = new ArrayList<>();
    c = new ArrayList<>();
    this.tns = new TwoNumbersSum();
  
  }

  @Test
  public void addTwoSingleDigitNum() {
    a.add(1);
    b.add(2);
    c.add(3);

    ArrayList<Integer> result = tns.addTwoNumbers(a,b);
    Assertions.assertEquals(c, result);
  }

//  @Test
//  public void addTwoDoubleDigitNum() {
//    a.add(11);
//    b.add(22);
//    c.add(33);
//
//    ArrayList<Integer> result = tns.addTwoNumbers(a,b);
//    Assertions.assertEquals(c, result);
//  }
//
//  @Test
//  public void addOneSingleOneDoubleDigitNum() {
//    a.add(1);
//    b.add(22);
//    c.add(23);
//
//    ArrayList<Integer> result = tns.addTwoNumbers(a,b);
//    Assertions.assertEquals(c, result);
//  }

  @Test
  public void addTwoSingleDigitNumTwice() {
    a.add(1);
    a.add(2);
    b.add(2);
    b.add(1);
    c.add(3);
    c.add(3);

    ArrayList<Integer> result = tns.addTwoNumbers(a,b);
    Assertions.assertEquals(c, result);
  }

}
