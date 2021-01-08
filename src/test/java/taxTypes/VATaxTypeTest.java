package taxTypes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VATaxTypeTest {

    @Test
    void positiveTest(){
        // given:
        VATaxType vaTaxType = new VATaxType();
        double amount = 1000;

        // when:
        double result = vaTaxType.calculateTaxFor(amount);

        // then:
        Assertions.assertEquals(180, result);
    }

}