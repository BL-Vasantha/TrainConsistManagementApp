import java.util.HashSet;
import java.util.Set;

/**
 * ==========================================
 * MAIN CLASS - UseCase3TrainConsistMgmt
 * ==========================================
 *
 * Use Case 3: Track Unique Bogie IDs
 *
 * Description:
 * This class ensures that duplicate bogie IDs
 * are not added into the train formation
 * using HashSet.
 *
 * At this stage, the application:
 * - Stores bogie IDs
 * - Prevents duplicates automatically
 * - Displays unique bogie identifiers
 *
 * This maps uniqueness validation using Set.
 *
 * @author Vasantha
 * @version 3.0
 */

public class TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println("UC3 - Track Unique Bogie IDs");
        System.out.println("================================\n");

        // Create HashSet for storing unique bogie IDs
        Set<String> bogieIds = new HashSet<>();


        // Add bogie IDs (duplicates intentionally added)
        bogieIds.add("BG104");
        bogieIds.add("BG103");
        bogieIds.add("BG102");
        bogieIds.add("BG101");

        // Duplicate values
        bogieIds.add("BG101");
        bogieIds.add("BG103");


        // Display final set
        System.out.println("Bogie IDs After Insertion:");

        System.out.println(bogieIds);

        System.out.println("\nNote:");
        System.out.println(
                "Duplicates are automatically ignored by HashSet."
        );

        System.out.println(
                "\nUC3 uniqueness validation completed..."
        );
    }
}