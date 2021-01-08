package taxTypes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgressiveTaxTypeTest {
    @Test
    void positiveTest(){
        // given:
        ProgressiveTaxType progressiveTaxType = new ProgressiveTaxType();
        double amount1 = 100;
        double amount2 = 1000;

        // when:
        double result1 = progressiveTaxType.calculateTaxFor(amount1);
        double result2 = progressiveTaxType.calculateTaxFor(amount2);

        // then:
        Assertions.assertEquals(10, result1);
        Assertions.assertEquals(150, result2);
    }

}