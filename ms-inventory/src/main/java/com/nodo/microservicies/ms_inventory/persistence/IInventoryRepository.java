package com.nodo.microservicies.ms_inventory.persistence;

import com.nodo.microservicies.ms_inventory.entities.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IInventoryRepository extends JpaRepository<Inventory, Long> {
}
