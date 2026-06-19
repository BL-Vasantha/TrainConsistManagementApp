import java.util.ArrayList;
import java.util.List;

/**
 * =======================================================
 * MAIN CLASS - UseCase2TrainConsistMgmt
 * =======================================================
 *
 * Use Case 2: Add Passenger Bogies to Train
 *
 * Description:
 * This use case demonstrates dynamic train consist
 * management using ArrayList operations.
 *
 * Features:
 * - Add passenger bogies
 * - Display current consist
 * - Remove a bogie
 * - Check existence of bogies
 * - Display final consist state
 *
 * Concepts:
 * - ArrayList
 * - add()
 * - remove()
 * - contains()
 * - CRUD Operations
 *
 * @author Developer
 * @version 1.0
 */

public class TrainConsistMgmt {

    public static void main(String[] args) {


        System.out.println("====================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("====================================\n");

        // Create passenger bogie list
        List<String> passengerBogies = new ArrayList<>();

        System.out.println("Train initialized successfully...\n");

        // ADD operation
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("Passenger bogies added.");
        System.out.println("Current Train Consist : "
                + passengerBogies);

        // REMOVE operation
        passengerBogies.remove("AC Chair");

        System.out.println("\nRemoved Bogie : AC Chair");

        // CHECK existence
        boolean exists =
                passengerBogies.contains("Sleeper");

        System.out.println(
                "Does Sleeper exist? : " + exists);

        // Final list
        System.out.println(
                "\nFinal Train Consist : "
                        + passengerBogies);

        System.out.println(
                "\nSystem ready for next operations...");
    }
}