 feature/UC4-maintain-ordered-bogie
import java.util.LinkedList;
import java.util.List;

/**
 * ==========================================
 * MAIN CLASS - UseCase4TrainConsistMgmt
 * ==========================================
 *
 * Use Case 4: Maintain Ordered Bogie Consist
 *
 * Description:
 * This class models the physical chaining of train bogies
 * using LinkedList for ordered operations.
 *
 * At this stage, the application:
 * - Adds bogies in sequence
 * - Inserts bogies at specific positions
 * - Removes bogies from front and rear
 * - Displays updated train structure
 *
 * This maps positional operations using LinkedList.
 *
 * @author Vasantha
 * @version 4.0
=======
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
 dev
 */

public class TrainConsistMgmt {

    public static void main(String[] args) {

feature/UC4-maintain-ordered-bogie
        System.out.println("==================================");
        System.out.println("UC4 - Maintain Ordered Bogie Consist");
        System.out.println("==================================\n");

        // Create LinkedList
        List<String> trainConsist = new LinkedList<>();


        // Add bogies in order
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist);


        // Insert Pantry Car at position 2
        trainConsist.add(2, "Pantry Car");

        System.out.println(
                "\nAfter Inserting 'Pantry Car' at position 2:"
        );

        System.out.println(trainConsist);


        // Remove first and last bogie
        trainConsist.remove(0);
        trainConsist.remove(trainConsist.size() - 1);

        System.out.println(
                "\nAfter Removing First and Last Bogie:"
        );

        System.out.println(trainConsist);

        System.out.println(
                "\nUC4 ordered consist operations completed..."

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
dev
        );
    }
}