package ie.kenoneil.coops.training;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ChangeCalcTest {

    @Test
    public void a_calculateChange_exactAmountTendered_noChange(){
        ChangeCalc objUnderTest = new ChangeCalc();
        Map<String, Integer> expectedChange = Collections.emptyMap();
        assertEquals(expectedChange, objUnderTest.calculateChange(100.00f, 100.00f));
    }

    @Test
    public void b_calculateChange_PayMoreThanCostBy1Cent_getChangeOf1Cent(){
        ChangeCalc objUnderTest = new ChangeCalc();
        Map<String, Integer> expectedChange = Stream.of(new Object[][] { { "1 Cent", 1 } }).collect(Collectors.toMap(data -> (String) data[0], data -> (Integer) data[1]));
        assertEquals(expectedChange, objUnderTest.calculateChange(100.00f, 100.01f));
    }

    @Test
    public void c_calculateChange_PayMoreThanCostBy2Cent_getChangeOf2Cent(){
        ChangeCalc objUnderTest = new ChangeCalc();
        Map<String, Integer> expectedChange = Stream.of(new Object[][] { { "2 Cent", 1 } }).collect(Collectors.toMap(data -> (String) data[0], data -> (Integer) data[1]));
        assertEquals(expectedChange, objUnderTest.calculateChange(100.00f, 100.02f));
    }

    @Test
    public void d_calculateChange_PayMoreThanCostBy5Cent_getChangeOf5Cent(){
        ChangeCalc objUnderTest = new ChangeCalc();
        Map<String, Integer> expectedChange = Stream.of(new Object[][] { { "5 Cent", 1 } }).collect(Collectors.toMap(data -> (String) data[0], data -> (Integer) data[1]));
        assertEquals(expectedChange, objUnderTest.calculateChange(100.00f, 100.05f));
    }

    @Test
    public void e_calculateChange_PayMoreThanCostBy10Cent_getChangeOf10Cent(){
        ChangeCalc objUnderTest = new ChangeCalc();
        Map<String, Integer> expectedChange = Stream.of(new Object[][] { { "10 Cent", 1 } }).collect(Collectors.toMap(data -> (String) data[0], data -> (Integer) data[1]));
        assertEquals(expectedChange, objUnderTest.calculateChange(100.00f, 100.10f));
    }

    @Test
    public void f_calculateChange_PayMoreThanCostBy20Cent_getChangeOf20Cent(){
        ChangeCalc objUnderTest = new ChangeCalc();
        Map<String, Integer> expectedChange = Stream.of(new Object[][] { { "20 Cent", 1 } }).collect(Collectors.toMap(data -> (String) data[0], data -> (Integer) data[1]));
        assertEquals(expectedChange, objUnderTest.calculateChange(100.00f, 100.20f));
    }

    @Test
    public void g_calculateChange_PayMoreThanCostBy50Cent_getChangeOf50Cent(){
        ChangeCalc objUnderTest = new ChangeCalc();
        Map<String, Integer> expectedChange = Stream.of(new Object[][] { { "50 Cent", 1 } }).collect(Collectors.toMap(data -> (String) data[0], data -> (Integer) data[1]));
        assertEquals(expectedChange, objUnderTest.calculateChange(100.00f, 100.50f));
    }


    @Test
    public void h_calculateChange_PayMoreThanCostByMultipleOfEveryCentCoin_getCorrectChange(){
        ChangeCalc objUnderTest = new ChangeCalc();
        Map<String, Integer> expectedChange = Stream.of(new Object[][] { { "50 Cent", 1 }, {"20 Cent", 1}, {"10 Cent", 1}, {"5 Cent", 1}, {"2 Cent", 1}, {"1 Cent", 1} }).collect(Collectors.toMap(data -> (String) data[0], data -> (Integer) data[1]));
        assertEquals(expectedChange, objUnderTest.calculateChange(100.00f, 100.88f));
    }


    @Test
    public void i_calculateChange_PayMoreThanCostByDoubleOfPossibleCoins_getCorrectChange(){
        ChangeCalc objUnderTest = new ChangeCalc();
        Map<String, Integer> expectedChange = Stream.of(new Object[][] { {"20 Cent", 2}, {"2 Cent", 2}}).collect(Collectors.toMap(data -> (String) data[0], data -> (Integer) data[1]));
        assertEquals(expectedChange, objUnderTest.calculateChange(100.00f, 100.44f));
    }
}
