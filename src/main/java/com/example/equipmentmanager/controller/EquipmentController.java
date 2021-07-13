package com.example.equipmentmanager.controller;

import com.example.equipmentmanager.model.Equipment;
import com.example.equipmentmanager.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EquipmentController {
    @Autowired
    private EquipmentService equipmentService;

    @GetMapping("/")
    public String showHomePage(){
        return "index";
    }
    //    displaying the equipments
    @GetMapping("/equipment")
    public String viewEquipmentsPage(Model model) {
        model.addAttribute("listEquipments", equipmentService.getAllEquipments());

        Equipment equipment = new Equipment();
        model.addAttribute("equipment", equipment);
        return "equipment";
    }

    @PostMapping("/saveEquipment")
    public String saveEquipment(@ModelAttribute("equipment") Equipment equipment) {
        equipmentService.saveEquipment(equipment);
        return "redirect:equipment";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable (value = "id") long id, Model model) {
        // get equipment from the service
        Equipment equipment = equipmentService.getEquipmentById(id);

        // set employee as a model attribute to pre-populate the form
        model.addAttribute("equipment", equipment);
        return "update_equipment";
    }

    @GetMapping("/viewAboutPage")
    public String viewAboutPage(){
        return "about_page";
    }
}
