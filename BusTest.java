import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest {

  Bus bus;
  Passenger passenger;

  @Before
  public void before(){
    bus = new Bus();
    passenger = new Passenger();
  }

  @Test
  public void busStartEmpty() {
    assertEquals(0, bus.count());
  }

  @Test
  public void busCanTakePassenger() {
    bus.addPassenger(passenger);
    assertEquals(1, bus.count());
  }

  @Test 
  public void cannotTakeMorePassengerWhenFull() {
    for ( int i = 0; i < 100; i++) {
      bus.addPassenger(new Passenger());
    }
    assertEquals(40, bus.count());
  }

  

}