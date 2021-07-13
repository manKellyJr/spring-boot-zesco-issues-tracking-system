package com.example.equipmentmanager.controller;

import com.example.equipmentmanager.model.Issues;
import com.example.equipmentmanager.service.EquipmentService;
import com.example.equipmentmanager.service.IssuesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IssuesController {

    @Autowired
    private IssuesService issuesService;

    @Autowired
    private EquipmentService equipmentService;

    //displaying the issues
    @GetMapping("/viewIssuesPage")
    public String viewIssuesPage(Model model) {
        // creating model to bind form data
        Issues issues = new Issues();
        model.addAttribute("issues", issues);
        model.addAttribute("listIssues", issuesService.getAllIssues());
        model.addAttribute("listEquipment", equipmentService.getAllEquipments());

        return "issues_page";
    }

    @PostMapping("/saveIssues")
    public String saveIssues(@ModelAttribute("issues") Issues issues, Model model) {
        // saving the details
        issuesService.saveIssues(issues);
        return "redirect:viewIssuesPage";
    }

}


