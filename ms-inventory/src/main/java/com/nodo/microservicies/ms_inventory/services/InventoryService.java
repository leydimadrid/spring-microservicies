package com.nodo.microservicies.ms_inventory.services;

import com.nodo.microservicies.ms_inventory.entities.Inventory;
import com.nodo.microservicies.ms_inventory.persistence.IInventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {

    @Autowired
    private IInventoryRepository inventoryRepository;

    public List<Inventory> findAll() {
        return (List<Inventory>) inventoryRepository.findAll();
    }


    public Inventory findById(Long id) {
        return inventoryRepository.findById(id).orElseThrow();
    }


    public void save(Inventory inventory) {
        inventoryRepository.save(inventory);
    }

}
