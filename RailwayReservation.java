import java.util.InputMismatchException;
import java.util.Scanner;

class SeatAlreadyBookedException extends Exception {
    public SeatAlreadyBookedException(String message) { super(message); }
}

class Reservation {
    private final boolean[] seats;
    private final int totalSeats;

    public Reservation(int totalSeats) {
        this.totalSeats = totalSeats;
        this.seats = new boolean[totalSeats + 1];
    }

    public void reserveSeat(int seatNumber) throws SeatAlreadyBookedException, IllegalArgumentException {
        if (seatNumber < 1 || seatNumber > totalSeats) {
            throw new IllegalArgumentException("Seat out of range (1-" + totalSeats + ").");
        }
        if (seats[seatNumber]) {
            throw new SeatAlreadyBookedException("Seat " + seatNumber + " already taken.");
        }
        seats[seatNumber] = true;
        System.out.println("Seat " + seatNumber + " reserved.");
    }
}

public class RailwayReservation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Reservation system = new Reservation(10);                                  

        System.out.print("Enter seat (1-10): ");
        try {
            int seatNumber = scanner.nextInt();
            system.reserveSeat(seatNumber);
        } catch (InputMismatchException e) {
            System.err.println("Error: Must be a number.");
        } catch (IllegalArgumentException | SeatAlreadyBookedException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Process finished.");
            scanner.close();
        }
    }
}
