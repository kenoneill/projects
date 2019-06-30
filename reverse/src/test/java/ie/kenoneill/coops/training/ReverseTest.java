package ie.kenoneill.coops.training;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseTest {

    @Test
    public void reverseString_singlechar_expectSingleChar(){
        Reverse objUnderTest = new Reverse();
        assertEquals("a", objUnderTest.reverse("a"));
    }

    @Test
    public void reverseString_multichar_expectMultiChar(){
        Reverse objUnderTest = new Reverse();
        assertEquals("cba", objUnderTest.reverse("abc"));
    }
}
