package controller;

import validation.RegexValidator;

public class ValidationController {

    private final RegexValidator validator;

    public ValidationController() {
        this.validator = new RegexValidator();
    }

    public void validate(String trainId, String cargoCode) {

        boolean trainValid = validator.isValidTrainId(trainId);
        boolean cargoValid = validator.isValidCargoCode(cargoCode);

        System.out.println("\n--- Validation Result ---");

        if (trainValid) {
            System.out.println("Train ID is VALID: " + trainId);
        } else {
            System.out.println("Train ID is INVALID: " + trainId);
        }

        if (cargoValid) {
            System.out.println("Cargo Code is VALID: " + cargoCode);
        } else {
            System.out.println("Cargo Code is INVALID: " + cargoCode);
        }
    }
}