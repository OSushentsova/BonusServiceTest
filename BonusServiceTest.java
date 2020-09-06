import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void forCalculatingRegisteredUnderLimit() {
        BonusService service = new BonusService();
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;
        long actual = service.calculate(amount, registered);
        boolean passed = expected == actual;
        assertEquals(expected, actual);
    }
    
    @org.junit.jupiter.api.Test
    void forCalculatingUnregisteredUnderLimit() {
        BonusService service = new BonusService();
        long amount = 1000_60;
        boolean registered = false;
        long expected = 10;
        long actual = service.calculate(amount, registered);
        boolean passed = expected == actual;
        assertEquals(expected, actual);
    }
    
    @org.junit.jupiter.api.Test
    void forCalculatingRegisteredAboveLimit() {
        BonusService service = new BonusService();
        long amount = 100500_60;
        boolean registered = true;
        long expected = 500;
        long actual = service.calculate(amount, registered);
        boolean passed = expected == actual;
        assertEquals(expected, actual);
    }
    
    @org.junit.jupiter.api.Test
    void forCalculatingUnRegisteredAboveLimit() {
        BonusService service = new BonusService();
        long amount = 100500_60;
        boolean registered = false;
        long expected = 500;
        long actual = service.calculate(amount, registered);
        boolean passed = expected == actual;
        assertEquals(expected, actual);
    }
}
