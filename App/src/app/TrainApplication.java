package app;

import controller.ValidationController;

import java.util.Scanner;


public class TrainApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ValidationController controller = new ValidationController();

        System.out.println("=== UC11: Validate Train ID & Cargo Code ===");

        // User Input
        System.out.print("Enter Train ID: ");
        String trainId = scanner.nextLine();

        System.out.print("Enter Cargo Code: ");
        String cargoCode = scanner.nextLine();

        // Validation
        controller.validate(trainId, cargoCode);

        // Demo invalid case
        System.out.println("\n--- Demo Invalid Inputs ---");
        controller.validate("TRAIN12", "PET-123");

        scanner.close();
    }
}