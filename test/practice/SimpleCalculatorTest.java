package practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    public void twoPlusTwoEqualsFour(){
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        assertEquals(4, simpleCalculator.add(2,2));
    }


    @Test
    public void threePlusSevenEqualsTen(){
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        assertEquals(10, simpleCalculator.add(3,7));
    }

}