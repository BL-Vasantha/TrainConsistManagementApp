package validation;

import java.util.regex.Pattern;

public class RegexValidator {

    // Regex Patterns
    private static final String TRAIN_REGEX = "TRN-\\d{4}";
    private static final String CARGO_REGEX = "PET-[A-Z]{2}";

    private final Pattern trainPattern;
    private final Pattern cargoPattern;

    // Constructor → Compile once (Best Practice)
    public RegexValidator() {
        this.trainPattern = Pattern.compile(TRAIN_REGEX);
        this.cargoPattern = Pattern.compile(CARGO_REGEX);
    }

    // Validate Train ID
    public boolean isValidTrainId(String trainId) {
        return trainPattern.matcher(trainId).matches();
    }

    // Validate Cargo Code
    public boolean isValidCargoCode(String cargoCode) {
        return cargoPattern.matcher(cargoCode).matches();
    }
}