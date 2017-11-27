package course.codingBat.recursion1;

import org.junit.Assert;
import org.junit.Test;

import static course.codingBat.recursion1.StrCopies.strCopies;
import static org.junit.Assert.*;

public class StrCopiesTest {
    @Test
    public void test() throws Exception {
        assertTrue(strCopies("catcowcat", "cat", 2));
    }


    @Test
    public void tes1t() throws Exception {
        assertFalse(strCopies("iiijjj", "i", 4));
    }


}