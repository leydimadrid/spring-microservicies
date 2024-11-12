package com.nodo.microservicies.ms_inventory.controller;

import com.nodo.microservicies.ms_inventory.entities.Inventory;
import com.nodo.microservicies.ms_inventory.services.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/inventory")
public class InventoryController {
    @Autowired
    private InventoryService inventoryService;


    @PostMapping("/save")
    public void saveInventory(@RequestBody Inventory inventory) {
        inventoryService.save(inventory);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(inventoryService.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok(inventoryService.findById(id));
    }
}
