import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdvancedCalculatorTest {
    AdvancedCalculator advancedCalc;

    @BeforeEach
    void setUp() {
        advancedCalc = new AdvancedCalculator();
        advancedCalc.setNumbers(9, 3);
        // 공통적인 부분을 미리 설정(set up)해서 코드가 작동되기 전 우선 작동(Before Each)
    }

    @Test
    void multiply() {
        assertEquals(27, advancedCalc.multiply());
    }

    @Test
    void divide() {
        assertEquals(3, advancedCalc.divide());
    }
}