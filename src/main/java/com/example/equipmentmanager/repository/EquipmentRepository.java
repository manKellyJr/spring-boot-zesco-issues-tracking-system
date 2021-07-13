package com.example.equipmentmanager.repository;

import com.example.equipmentmanager.model.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipmentRepository extends JpaRepository<Equipment, Long> {
}
