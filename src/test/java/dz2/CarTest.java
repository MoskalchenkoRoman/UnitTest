package dz2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void Class() {
        Car car = new Car("BMW","A6",2020);
        Vehicle Vehicle = null;
        assertInstanceOf(Vehicle,car);
    }

    private void assertInstanceOf(Vehicle vehicle, Car car) {
    }

    @Test
    void testDrive() {
        Car car = new Car("BMW","A6",2020);
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    void park() {
        Car car = new Car("BMW","A6",2020);
        car.park();
        assertEquals(0, car.getSpeed());
    }

    @Test
    void getNumWheels() {
        Car car = new Car("BMW","A6",2020);
        assertEquals(4, car.getNumWheels());
    }
}