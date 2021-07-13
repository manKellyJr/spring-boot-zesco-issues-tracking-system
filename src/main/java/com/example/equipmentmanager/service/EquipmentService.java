package com.example.equipmentmanager.service;

import com.example.equipmentmanager.model.Equipment;

import java.util.List;

public interface EquipmentService {
    List<Equipment> getAllEquipments();
    void saveEquipment(Equipment equipment);
    Equipment getEquipmentById(long id);
}
