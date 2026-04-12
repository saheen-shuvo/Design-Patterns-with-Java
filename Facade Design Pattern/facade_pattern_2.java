// TODO: Implement the VacationFacade class to provide a simplified interface for booking a vacation package.
public class VacationFacade {
    private FlightBooking flightBooking;
    private HotelBooking hotelBooking;
    private CarRental carRental;

    public VacationFacade() {
        // Initialize the subsystems
        this.flightBooking = new FlightBooking();
        this.hotelBooking = new HotelBooking();
        this.carRental = new CarRental();
    }

    // TODO: Implement the bookVacation method to book flight, hotel, and car rental using the subsystems.
    public void bookVacation() {
        // Book the vacation package using the subsystems
        System.out.println("Booking vacation package...");
        flightBooking.bookFlight();
        hotelBooking.bookHotel();
        carRental.rentCar();
        System.out.println("Vacation booked successfully!");
    }
}

public class FlightBooking {
    public void bookFlight() {
        System.out.println("Flight booked successfully.");
    }
}

public class HotelBooking {
    public void bookHotel() {
        System.out.println("Hotel booked successfully.");
    }
}

public class CarRental {
    public void rentCar() {
        System.out.println("Car rented successfully.");
    }
}