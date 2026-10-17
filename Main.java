import java.util.Scanner;

/**
 * Main class for the Tourism and Agriculture
 * Inheritance Demonstration System.
 *
 * @author Student
 * @version 1.0
 */
public class Main {

    /**
     * Main method of the application.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Farm farm = new Farm(
            "Rice",
            5.5,
            "Green Valley Farm",
            "Goa"
        );

        Tourist tourist = new Tourist(
            "Goa",
            500,
            "Rahul",
            "Indian"
        );

        TouristGuide guide = new TouristGuide(
            "Goa",
            750,
            "Anita",
            "Indian",
            "TG101",
            "English"
        );

        Heritage heritage = new Heritage(
            "Old Goa",
            200,
            "Basilica of Bom Jesus",
            1605
        );

        int choice;

        do {

            System.out.println("\n==================================");
            System.out.println(" TOURISM & AGRICULTURE SYSTEM");
            System.out.println("==================================");

            System.out.println("1. Single Inheritance");
            System.out.println("2. Multilevel Inheritance");
            System.out.println("3. Hierarchical Inheritance");
            System.out.println("4. Multiple Inheritance");
            System.out.println("5. Hybrid Inheritance");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:

                    System.out.println(
                        "\n*** SINGLE INHERITANCE ***"
                    );

                    System.out.println(
                        "Agriculture -> Farm"
                    );

                    farm.displayFarm();
                    farm.farmingActivity();
                    farm.farmTourism();

                    break;

                case 2:

                    System.out.println(
                        "\n*** MULTILEVEL INHERITANCE ***"
                    );

                    System.out.println(
                        "Tourism -> Tourist -> TouristGuide"
                    );

                    guide.displayGuide();
                    guide.bookTour();
                    guide.guideTour();

                    break;

                case 3:

                    System.out.println(
                        "\n*** HIERARCHICAL INHERITANCE ***"
                    );

                    System.out.println(
                        "Tourism -> Tourist"
                    );

                    System.out.println(
                        "Tourism -> Heritage"
                    );

                    tourist.displayTourist();
                    tourist.bookTour();

                    heritage.displayHeritage();
                    heritage.heritageTour();

                    break;

                case 4:

                    System.out.println(
                        "\n*** MULTIPLE INHERITANCE ***"
                    );

                    System.out.println(
                        "Java achieves multiple inheritance"
                    );

                    System.out.println(
                        "using interfaces."
                    );

                    System.out.println(
                        "TouristGuide extends Tourist"
                    );

                    System.out.println(
                        "and implements AgricultureServices"
                    );

                    guide.displayGuide();
                    guide.provideFarmExperience();

                    break;

                case 5:

                    System.out.println(
                        "\n*** HYBRID INHERITANCE ***"
                    );

                    System.out.println(
                        "Combination of multiple inheritance structures."
                    );

                    System.out.println(
                        "Tourism -> Tourist -> TouristGuide"
                    );

                    System.out.println(
                        "Tourism -> Heritage"
                    );

                    System.out.println(
                        "TouristGuide -> AgricultureServices"
                    );

                    guide.guideTour();
                    guide.provideFarmExperience();

                    heritage.heritageTour();

                    break;

                case 6:

                    System.out.println(
                        "\nThank you for using the system!"
                    );

                    break;

                default:

                    System.out.println(
                        "\nInvalid choice!"
                    );
            }

        } while (choice != 6);

        scanner.close();
    }
}
