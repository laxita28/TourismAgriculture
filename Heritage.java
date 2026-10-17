/**
 * Represents a heritage tourism destination.
 *
 * Demonstrates Hierarchical Inheritance.
 *
 * @author Student
 * @version 1.0
 */
public class Heritage extends Tourism {

    private String heritageSite;
    private int yearEstablished;

    /**
     * Creates a Heritage object.
     *
     * @param destination destination
     * @param ticketPrice entry ticket price
     * @param heritageSite name of heritage site
     * @param yearEstablished year established
     */
    public Heritage(String destination, double ticketPrice,
                    String heritageSite, int yearEstablished) {

        super(destination, ticketPrice);
        this.heritageSite = heritageSite;
        this.yearEstablished = yearEstablished;
    }

    /**
     * Displays heritage site information.
     */
    public void displayHeritage() {
        System.out.println("\n--- Heritage Site Details ---");
        System.out.println("Heritage Site: " + heritageSite);
        System.out.println("Year Established: " + yearEstablished);

        displayTourism();
    }

    /**
     * Describes heritage tourism.
     */
    public void heritageTour() {
        System.out.println(
            "Visitors can explore historical and cultural heritage."
        );
    }
}
