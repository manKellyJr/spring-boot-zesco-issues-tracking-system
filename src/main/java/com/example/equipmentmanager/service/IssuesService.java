package com.example.equipmentmanager.service;

import com.example.equipmentmanager.model.Issues;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IssuesService {
    List<Issues> getAllIssues();
    void saveIssues(Issues issues);
}
