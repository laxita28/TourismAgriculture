/**
 * Represents a tourist guide.
 *
 * Demonstrates Multilevel Inheritance:
 * Tourism -> Tourist -> TouristGuide
 *
 * Also implements Agriculture to demonstrate
 * multiple inheritance through interfaces.
 *
 * @author Student
 * @version 1.0
 */
public class TouristGuide extends Tourist implements AgricultureServices {

    private String guideId;
    private String language;

    /**
     * Creates a TouristGuide object.
     *
     * @param destination destination
     * @param ticketPrice ticket price
     * @param touristName tourist name
     * @param nationality nationality
     * @param guideId guide identification
     * @param language language spoken by guide
     */
    public TouristGuide(String destination, double ticketPrice,
                        String touristName, String nationality,
                        String guideId, String language) {

        super(destination, ticketPrice, touristName, nationality);

        this.guideId = guideId;
        this.language = language;
    }

    /**
     * Displays guide information.
     */
    public void displayGuide() {

        System.out.println("\n--- Tourist Guide Details ---");

        displayTourist();

        System.out.println("Guide ID: " + guideId);
        System.out.println("Language: " + language);
    }

    /**
     * Provides guidance to tourists.
     */
    public void guideTour() {
        System.out.println(
            "Guide " + guideId +
            " is guiding tourists in " + language + "."
        );
    }

    /**
     * Implements agriculture service.
     */
    @Override
    public void provideFarmExperience() {
        System.out.println(
            "Tourist Guide is arranging a farm tourism experience."
        );
    }
}
