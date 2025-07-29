package org.roche.azure_s3_transfer_service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/transfers")
public class TransferController {
    @GetMapping("/initiate")
    public ResponseEntity<String> initiateTransfer() {
        // Logic to initiate transfer
        return ResponseEntity.ok("Transfer initiated successfully");
    }

    @GetMapping("/status")
    public ResponseEntity<String> getTransferStatus() {
        // Logic to get transfer status
        return ResponseEntity.ok("Transfer status: In Progress");
    }
}
