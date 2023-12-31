package com.example.springapp.service;

import com.example.springapp.model.Medicine;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MedicineService {

    private Map<Integer, Medicine> medicineMap = new HashMap<>();
    private int nextMedicineId = 1;

    public boolean addMedicine(Medicine medicine) {
        // medicine.setMedicineId(medicine.getMedicineId());
        // medicineMap.put(medicine.getMedicineId(), medicine);
        return true; // Medicine added successfully
    }

    public Medicine updateMedicine(int medicineId, Medicine updatedMedicine) {
        Medicine existingMedicine = medicineMap.get(medicineId);
            // Update fields of existingMedicine with values from updatedMedicine
            existingMedicine.setMedicineName(updatedMedicine.getMedicineName());
            existingMedicine.setPrice(updatedMedicine.getPrice());
            existingMedicine.setQuantity(updatedMedicine.getQuantity());
            existingMedicine.setDescription(updatedMedicine.getDescription());
            return existingMedicine;
    }
}
