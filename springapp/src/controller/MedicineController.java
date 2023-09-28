package com.yourpackage.controller;

import com.yourpackage.model.Medicine;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/medicines")
public class MedicineController {

    private Map<Integer, Medicine> medicineMap = new HashMap<>();

        @PostMapping("/")
            public boolean addMedicine(@RequestBody Medicine medicine) {
                    // Implement logic to add the medicine to the collection
                            // Return "true" if successful, otherwise "false"
                                    if (!medicineMap.containsKey(medicine.getMedicineId())) {
                                                medicineMap.put(medicine.getMedicineId(), medicine);
                                                            return true;
                                                                    }
                                                                            return false;
                                                                                }

                                                                                    @PutMapping("/{medicineId}")
                                                                                        public Medicine updateMedicine(@PathVariable int medicineId, @RequestBody Medicine updatedMedicine) {
                                                                                                // Implement logic to update the medicine with the given medicineId
                                                                                                        if (medicineMap.containsKey(medicineId)) {
                                                                                                                    Medicine existingMedicine = medicineMap.get(medicineId);
                                                                                                                                existingMedicine.setMedicineName(updatedMedicine.getMedicineName());
                                                                                                                                            existingMedicine.setPrice(updatedMedicine.getPrice());
                                                                                                                                                        existingMedicine.setQuantity(updatedMedicine.getQuantity());
                                                                                                                                                                    existingMedicine.setDescription(updatedMedicine.getDescription());
                                                                                                                                                                                return existingMedicine;
                                                                                                                                                                                        }
                                                                                                                                                                                                return null; // Return null if medicine with the given ID is not found
                                                                                                                                                                                                    }
                                                                                                                                                                                                    }
                                                                                                                                                                                                    