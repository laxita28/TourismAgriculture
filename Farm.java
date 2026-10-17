/**
 * Represents a farm that inherits from Agriculture.
 *
 * Demonstrates Single Inheritance.
 *
 * @author Student
 * @version 1.0
 */
public class Farm extends Agriculture {

    private String farmName;
    private String location;

    /**
     * Creates a Farm object.
     *
     * @param crop type of crop
     * @param landArea farm land area
     * @param farmName name of the farm
     * @param location location of the farm
     */
    public Farm(String crop, double landArea,
                String farmName, String location) {

        super(crop, landArea);
        this.farmName = farmName;
        this.location = location;
    }

    /**
     * Displays farm details.
     */
    public void displayFarm() {
        System.out.println("\n--- Farm Details ---");
        System.out.println("Farm Name: " + farmName);
        System.out.println("Location: " + location);

        displayAgriculture();
    }

    /**
     * Provides a farm tourism experience.
     */
    public void farmTourism() {
        System.out.println(
            "Visitors can experience farming and learn about crops."
        );
    }
}
