package taxTypes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IncomeTaxTypeTest {

    @Test
    void positiveTest (){
        //given:
        IncomeTaxType incomeTaxType = new IncomeTaxType();
        double amount = 100;

        // when:
        double result = incomeTaxType.calculateTaxFor(amount);

        // then:
        Assertions.assertEquals(13, result);

    }
}