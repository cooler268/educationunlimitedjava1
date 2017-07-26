
import car1.Car1;
import org.junit.Test;
import static org.junit.Assert.*;

public class CarUnitTest {

    double e = 0.000000000001;
    Car1 c = new Car1("Toyota", "Camry", 1999, "Bob", "teal", 8, 100000);

    @Test
    public void makeGetterTest() {
        assertEquals(c.getMake(), "Toyota", c);
    }

    @Test
    public void makeSetterTest() {
        c.setMake("Honda");
        assertEquals(c.getMake(), "Honda");
    }

    @Test
    public void makeGetterTest1() {
        assertEquals(c.getMake(), "Camry", c);

    }

    public CarUnitTest() {
    }

}
