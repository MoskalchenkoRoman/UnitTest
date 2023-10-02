package dz6;

import org.junit.jupiter.api.Test;

class ComparisonTest {

    @Test
    void comparison() {
        double averagelist1 = 5.0;
        double averagelist2 = 5.0;
        double averagelist3 = 6.0;

        assert(averagelist1 == averagelist2);

        assert(averagelist3 > averagelist1);

        assert(averagelist1 < averagelist3);
    }

}