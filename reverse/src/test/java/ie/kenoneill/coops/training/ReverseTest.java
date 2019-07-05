package ie.kenoneill.coops.training;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ReverseTest {

    @Test
    public void a_reverseString_singlechar_expectSingleChar(){
        Reverse objUnderTest = new Reverse();
        assertEquals("a", objUnderTest.reverse("a"));
    }

    @Test
    public void b_reverseString_multichar_expectMultiChar(){
        Reverse objUnderTest = new Reverse();
        assertEquals("cba", objUnderTest.reverse("abc"));
    }

    @Test
    public void c_reverseString_multicharWithSpaces_expectMultiChar(){
        Reverse objUnderTest = new Reverse();
        assertEquals("cba asawerf fwefd easfweqa fdaf earf qrdfc dz", objUnderTest.reverse("zd cfdrq frae fadf aqewfsae dfewf frewasa abc"));
    }
//
//    @Test
//    public void d_bonus_reverseString_multicharWithSpaces_expectMultiCharWithoutSpaces(){
//        Reverse objUnderTest = new Reverse();
//        assertEquals("cbaasawerffwefdeasfweqafdafearfqrdfcdz", objUnderTest.reverseIgnoreSpaces("zd cfdrq frae fadf aqewfsae dfewf frewasa abc"));
//    }
//
//    @Test
//    public void d_bonus_reverseWords_multicharWithSpaces_expectMultiCharWithoutSpaces(){
//        Reverse objUnderTest = new Reverse();
//        assertEquals("Hobbit a lived ground the in hole a In", objUnderTest.reverseWords("In a hole in the ground lived a Hobbit"));
//    }

}
