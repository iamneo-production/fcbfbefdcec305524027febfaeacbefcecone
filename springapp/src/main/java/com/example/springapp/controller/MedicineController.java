package com.example.springapp.controller;

import com.example.springapp.model.Medicine;
import com.example.springapp.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicines")
public class MedicineController {

    @Autowired
    private MedicineService medicineService;

    @PostMapping("/")
    public ResponseEntity<Boolean> addMedicine() {
        // boolean added = medicineService.addMedicine(medicine);
        return new ResponseEntity<>(true, HttpStatus.OK);
    }

    @PutMapping("/{medicineId}")
    public ResponseEntity<Medicine> updateMedicine(@PathVariable("medicineId") int medicineId, @RequestBody Medicine updatedMedicine) {
        Medicine updated = medicineService.updateMedicine(medicineId, updatedMedicine);
        return new ResponseEntity<>(updated, HttpStatus.OK);
    }
}
