package dz2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotorcycleTest {

    @Test
    void testDrive() {
        Motorcycle moto = new Motorcycle("BMW","R1300",2020 );
        moto.testDrive();
        assertEquals(75, moto.getSpeed());
    }

    @Test
    void park() {
        Motorcycle moto = new Motorcycle("BMW","R1300",2020 );
        moto.park();
        assertEquals(0, moto.getSpeed());
    }

    @Test
    void getNumWheels() {
        Motorcycle moto = new Motorcycle("BMW","R1300",2020 );
        assertEquals(2, moto.getNumWheels());
    }
}