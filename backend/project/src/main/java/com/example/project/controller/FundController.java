package com.example.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.model.Fund;
import com.example.project.service.FundService;

// @RestController
// @RequestMapping("/api")
// public class FundController {
//     @Autowired
//     private final FundService fundService;

//     public FundController(FundService fundService) {
//         this.fundService = fundService;
//     }

//     @PostMapping("/funds")
//     // insert the data
//     public ResponseEntity<Fund> createFund(@RequestBody Fund fund) {
//         Fund createdFund = fundService.createFund(fund);
//         return new ResponseEntity<>(createdFund, HttpStatus.CREATED);
//     }

//     @GetMapping("/fund")
//     public ResponseEntity<List<Fund>> getAllFund() {
//         List<Fund> funds = fundService.getAllFund();
//         return new ResponseEntity<>(funds, HttpStatus.OK);
//     }

//     // @GetMapping("/medicine/{medicineId}")
//     // public ResponseEntity<Medicine> getById(@PathVariable int medicineId) {
//     //     Medicine medicine = medicineService.getMedicineId(medicineId);
//     //     if (medicine != null) {
//     //         return new ResponseEntity<>(medicine, HttpStatus.OK);
//     //     } else {
//     //         return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//     //     }
//     // }

//     @GetMapping("/fund/{fundId}")
// public ResponseEntity<Fund> getById(@PathVariable int fundId) {
//     Fund fund = fundService.getFundId(fundId);
//     if (fund != null) {
//         return new ResponseEntity<>(fund, HttpStatus.OK);
//     } else {
//         return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//     }
// }
// }

@RestController
@RequestMapping("/api")
public class FundController{
    @Autowired
    private final FundService fundService;

    public FundController(FundService fundService) {
        this.fundService = fundService;
    }

    @PostMapping("/fund")  // Corrected path
    public ResponseEntity<Fund> createFund(@RequestBody Fund fund) {
        Fund createdFund = fundService.createFund(fund);
        return new ResponseEntity<>(createdFund, HttpStatus.CREATED);
    }

    @GetMapping("/fund")  // Corrected path
    public ResponseEntity<List<Fund>> getAllFunds() {
        List<Fund> funds = fundService.getAllFund();
        return new ResponseEntity<>(funds, HttpStatus.OK);
    }

    @GetMapping("/fund/{user_Id}")  // Corrected path
    public ResponseEntity<Fund> getById(@PathVariable int user_Id) {
        Fund fund = fundService.getFundId(user_Id);
        if (fund != null) {
            return new ResponseEntity<>(fund, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}