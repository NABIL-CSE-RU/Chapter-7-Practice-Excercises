import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
class RangeInputTest {
 RangeInput passenger1, passenger2, driver1;
    @BeforeEach
    void setUp() {
     passenger1 = new RangeInput(40, 50);
     passenger2 = new RangeInput(30, 40);
     driver1 = new RangeInput();
    }

    @Test
    void getCurrentTemperatureForPassenger1() {
        passenger1.up();
        passenger1.up();
        passenger1.up();
        passenger1.down();
        passenger1.down();
        assertEquals(46, passenger1.getCurrentTemperature());
    }
    @Test
    void getCurrentTemperatureForPassenger2() {
        passenger2.up();
        passenger2.up();
        passenger2.up();
        passenger2.down();
        passenger2.up();
        assertEquals(38, passenger2.getCurrentTemperature());
    }
    @Test
    void getCurrentTemperatureForDriver1() {
        driver1.up();
        driver1.up();
        driver1.up();
        driver1.down();
        driver1.down();
        assertEquals(70, driver1.getCurrentTemperature());
    }
}