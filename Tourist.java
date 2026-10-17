/**
 * Represents a tourist.
 *
 * Demonstrates Hierarchical Inheritance as a child of Tourism.
 *
 * @author Student
 * @version 1.0
 */
public class Tourist extends Tourism {

    protected String touristName;
    protected String nationality;

    /**
     * Creates a Tourist object.
     *
     * @param destination tourist destination
     * @param ticketPrice ticket price
     * @param touristName tourist name
     * @param nationality tourist nationality
     */
    public Tourist(String destination, double ticketPrice,
                   String touristName, String nationality) {

        super(destination, ticketPrice);
        this.touristName = touristName;
        this.nationality = nationality;
    }

    /**
     * Displays tourist details.
     */
    public void displayTourist() {
        System.out.println("\n--- Tourist Details ---");
        System.out.println("Tourist Name: " + touristName);
        System.out.println("Nationality: " + nationality);

        displayTourism();
    }

    /**
     * Books a tourist visit.
     */
    public void bookTour() {
        System.out.println(
            touristName + " has booked a tour to " + destination
        );
    }
}
