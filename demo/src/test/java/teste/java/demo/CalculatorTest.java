package teste.java.demo;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    public void testeSum() {
        Calculator calculator = new Calculator();
        assertThat(calculator.sum(2, 3)).isEqualTo(5);    
    }
}
