package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    @Test
    public void gIsHappy() {
        GHappy gh = new GHappy();
	boolean happy = gh.gHappy("xxggxx");
	Assertions.assertTrue(happy);
    }

    @Test
    public void gIsNotHappy() {
        GHappy gh = new GHappy();
	boolean happy = gh.gHappy("xxgxx");
	Assertions.assertFalse(happy);
    }

    @Test
    public void notAllgHappy() {
        GHappy gh = new GHappy();
	boolean happy = gh.gHappy("xxggyygxx");
	Assertions.assertFalse(happy);
    }


    @Test
    public void gAlone() {
        GHappy gh = new GHappy();
	boolean happy = gh.gHappy("g");
	Assertions.assertFalse(happy);
    }

    @Test
    public void gOnly() {
        GHappy gh = new GHappy();
	boolean happy = gh.gHappy("ggg");
	Assertions.assertTrue(happy);
    }


//    @Test
//    public void gNo() {
//        GHappy gh = new GHappy();
//	boolean happy = gh.gHappy("xyu");
//	Assertions.assertFalse(happy);
//    }

    @Test
    public void empty() {
        GHappy gh = new GHappy();
	boolean happy = gh.gHappy("");
	Assertions.assertFalse(happy);
    }

}
