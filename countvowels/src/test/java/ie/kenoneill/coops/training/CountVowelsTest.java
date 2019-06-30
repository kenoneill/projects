package ie.kenoneill.coops.training;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class CountVowelsTest {

    @Test
    public void countVowels_novowels_expect0(){
        CountVowels objUnderTest = new CountVowels("Rhythm");
        assertEquals(0, objUnderTest.countA());
        assertEquals(0, objUnderTest.countE());
        assertEquals(0, objUnderTest.countI());
        assertEquals(0, objUnderTest.countO());
        assertEquals(0, objUnderTest.countU());
    }

    @Test
    @FileParameters("src/test/resources/testDataSingleVowel.csv")
    public void countVowels_singleVowel_expectCorrectCountAll(long a, long e, long i, long o, long u, String word){
        CountVowels objUnderTest = new CountVowels(word);
        assertEquals(a, objUnderTest.countA());
        assertEquals(e, objUnderTest.countE());
        assertEquals(i, objUnderTest.countI());
        assertEquals(o, objUnderTest.countO());
        assertEquals(u, objUnderTest.countU());
    }

    @Test
    @FileParameters("src/test/resources/testDataMultipleVowels.csv")
    public void countVowels_multipleVowels_expectCorrectCountAll(long a, long e, long i, long o, long u, String word){
        CountVowels objUnderTest = new CountVowels(word);
        assertEquals(a, objUnderTest.countA());
        assertEquals(e, objUnderTest.countE());
        assertEquals(i, objUnderTest.countI());
        assertEquals(o, objUnderTest.countO());
        assertEquals(u, objUnderTest.countU());
    }
    @Test
    @FileParameters("src/test/resources/testDataMultipleVowelsWithCapitals.csv")
    public void countVowels_multipleVowelsWithCapitals_expectCorrectCountAll(long a, long e, long i, long o, long u, String word){
        CountVowels objUnderTest = new CountVowels(word);
        assertEquals(a, objUnderTest.countA());
        assertEquals(e, objUnderTest.countE());
        assertEquals(i, objUnderTest.countI());
        assertEquals(o, objUnderTest.countO());
        assertEquals(u, objUnderTest.countU());
    }



}
