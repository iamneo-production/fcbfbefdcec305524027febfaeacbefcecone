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

    @PostMapping
    public ResponseEntity<Boolean> addMedicine(@RequestBody Medicine medicine) {
        boolean added = medicineService.addMedicine(medicine);
        if (added) {
            return new ResponseEntity<>(true, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(false, HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/{medicineId}")
    public ResponseEntity<Medicine> updateMedicine(@PathVariable int medicineId,
            @RequestBody Medicine updatedMedicine) {
        Medicine updated = medicineService.updateMedicine(medicineId, updatedMedicine);
        if (updated != null) {
            return new ResponseEntity<>(updated, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
