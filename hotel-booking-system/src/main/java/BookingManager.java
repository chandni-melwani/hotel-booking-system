import java.util.*;

public class BookingManager {
    private Map<Integer, Room> rooms = new HashMap<>();

    public BookingManager() {
        for (int i = 101; i <= 105; i++) {
            rooms.put(i, new Room(i));
        }
    }

    public synchronized String bookRoom(int roomNumber) {
        Room room = rooms.get(roomNumber);
        if (room == null) return "Invalid Room";
        if (room.isBooked()) return "Already Booked";
        
        room.setBooked(true);
        return "Booking Successful";
    }

    public synchronized String cancelBooking(int roomNumber) {
        Room room = rooms.get(roomNumber);
        if (room == null || !room.isBooked()) return "No booking found";
        
        room.setBooked(false);
        return "Cancellation Successful";
    }
}