package service;

import model.GoodsBogie;
import exception.CargoSafetyException;

public class CargoService {

    public void assignCargo(GoodsBogie bogie, String cargo) {

        try {
            // 🔍 Validation logic
            if (bogie.getType().equalsIgnoreCase("rectangular") &&
                    cargo.equalsIgnoreCase("petroleum")) {

                throw new CargoSafetyException(
                        "Unsafe Assignment: Petroleum cannot be loaded in rectangular bogie"
                );
            }

            // ✅ Safe assignment
            bogie.setCargo(cargo);
            System.out.println("Cargo assigned successfully: " + cargo);

        } catch (CargoSafetyException e) {

            // ❌ Graceful handling
            System.out.println("Error: " + e.getMessage());

        } finally {

            // 🔄 Always executes
            System.out.println("Cargo assignment attempt completed\n");
        }
    }
}