package ie.kenoneill.coops.training;

import org.junit.Test;

import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class OddNumbersTest {

    @Test
    public void test(){
        OddNumbers objUnderTest = new OddNumbers();
        assertEquals(Collections.singleton(1), objUnderTest.oddNumbers(2));
    }

    @Test
    public void test2(){
        OddNumbers objUnderTest = new OddNumbers();
        Set<Integer> expectedValues = Stream.of(1,3,5,7,9).collect(Collectors.toSet());
        assertEquals(expectedValues, objUnderTest.oddNumbers(10));
    }
}
