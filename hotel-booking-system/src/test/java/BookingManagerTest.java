import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class BookingManagerTest {
    BookingManager manager = new BookingManager(); 

    @Test
    void testBookingSuccess() {
        assertEquals("Booking Successful", manager.bookRoom(101));
    }

    @Test
    void testDoubleBookingFailure() {
        manager.bookRoom(102);
        assertEquals("Already Booked", manager.bookRoom(102));
    }
}