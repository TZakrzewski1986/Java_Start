package part_3_arrays_.TicketController;

import java.time.Duration;

public class TicketMachine {

    public static void buyTicket(Passenger passenger, int timeMinutes){
        Ticket ticket = new Ticket(timeMinutes);
        passenger.setTicket(ticket);
    }
}
