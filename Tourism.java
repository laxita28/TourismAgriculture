/**
 * Base class representing tourism activities.
 *
 * @author Student
 * @version 1.0
 */
public class Tourism {

    protected String destination;
    protected double ticketPrice;

    /**
     * Creates a Tourism object.
     *
     * @param destination tourist destination
     * @param ticketPrice ticket price
     */
    public Tourism(String destination, double ticketPrice) {
        this.destination = destination;
        this.ticketPrice = ticketPrice;
    }

    /**
     * Displays tourism information.
     */
    public void displayTourism() {
        System.out.println("Destination: " + destination);
        System.out.println("Ticket Price: Rs." + ticketPrice);

    }

    /**
     * Describes tourism activity.
     */
    public void tourismActivity() {
        System.out.println("Tourists are exploring the destination.");
    }
}
