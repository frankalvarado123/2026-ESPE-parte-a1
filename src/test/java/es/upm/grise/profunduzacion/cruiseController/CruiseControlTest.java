package es.upm.grise.profunduzacion.cruiseController;
import static org.junit.jupiter.api.Assertions.*;//
import org.junit.jupiter.api.BeforeEach;//
import org.junit.jupiter.api.Test;


class CruiseControlTest {
	
	@Test
    public void smokeTest() {}

  @BeforeEach
    void setUp() {
        cruiseControl = new CruiseControl();
    }

    @Test
    void testSetSpeedSetCorrectWithoutSpeedLimit() throws Exception {
        cruiseControl.setSpeedSet(80);
        assertEquals(80, cruiseControl.getSpeedSet());
    }

    @Test
    void testSetSpeedSetZeroThrowsException() {
        assertThrows(IncorrectSpeedSetException.class, () -> {
            cruiseControl.setSpeedSet(0);
        });
    }

   
    @Test
    void testSetSpeedSetNegativeThrowsException() {
        assertThrows(IncorrectSpeedSetException.class, () -> {
            cruiseControl.setSpeedSet(-10);
        });
    }

   
    @Test
    void testSetSpeedSetBelowSpeedLimit() throws Exception {
        cruiseControl.setSpeedLimit(120);
        cruiseControl.setSpeedSet(100);
        assertEquals(100, cruiseControl.getSpeedSet());
    }

    @Test
    void testSetSpeedSetEqualToSpeedLimit() throws Exception {
        cruiseControl.setSpeedLimit(120);
        cruiseControl.setSpeedSet(120);
        assertEquals(120, cruiseControl.getSpeedSet());
    }

   
    @Test
    void testSetSpeedSetAboveSpeedLimitThrowsException() {
        cruiseControl.setSpeedLimit(120);

        assertThrows(SpeedSetAboveSpeedLimitException.class, () -> {
            cruiseControl.setSpeedSet(130);
        });
    }
    
}



