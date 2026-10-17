/**
 * Represents agricultural activities in the tourism and agriculture domain.
 *
 * @author Student
 * @version 1.0
 */
public class Agriculture {

    protected String crop;
    protected double landArea;

    /**
     * Creates an Agriculture object.
     *
     * @param crop name of the crop
     * @param landArea area of agricultural land in acres
     */
    public Agriculture(String crop, double landArea) {
        this.crop = crop;
        this.landArea = landArea;
    }

    /**
     * Displays agriculture information.
     */
    public void displayAgriculture() {
        System.out.println("Crop: " + crop);
        System.out.println("Land Area: " + landArea + " acres");
    }

    /**
     * Describes farming activity.
     */
    public void farmingActivity() {
        System.out.println("The farm is involved in sustainable agriculture.");
    }
}
