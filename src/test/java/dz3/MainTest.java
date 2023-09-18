package dz3;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


class MainTest {

    @Test
    void isEven() {
        boolean ans = true;
        boolean val;
        int num = 6;
        Main ven = new Main();
        val = ven.isEven(num);
        assertEquals(ans,val);

        boolean an = false;
        boolean va;
        int n = 7;
        Main ve = new Main();
        va = ve.isEven(n);
        assertEquals(an,va);
    }


    @Test
    void enteringTheRange() {
        boolean ans = false;
        boolean val;
        int beginningRabge = 25;
        int endRange = 100;
        int desiredValue = 6;
        Main ven = new Main();
        val = ven.enteringTheRange(beginningRabge, endRange, desiredValue);
        assertEquals(ans,val);

        boolean an = true;
        boolean va;
        int desiredValue1 = 26;
        va = ven.enteringTheRange(beginningRabge, endRange, desiredValue1);
        assertEquals(an,va);
    }


}