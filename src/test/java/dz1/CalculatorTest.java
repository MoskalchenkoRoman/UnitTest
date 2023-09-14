package dz1;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void calculatingDiscount() {
        Calculator calculator = new Calculator();
        double total = calculator.calculatingDiscount(500.5, 500);
        assert total > 0 : "Сумма не может быть меньше 1";
    }

}