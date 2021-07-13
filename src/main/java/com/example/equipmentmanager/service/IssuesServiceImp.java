package com.example.equipmentmanager.service;

import com.example.equipmentmanager.model.Issues;
import com.example.equipmentmanager.repository.IssuesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IssuesServiceImp implements IssuesService{

    @Autowired
    private IssuesRepository issuesRepository;

    @Override
    public List<Issues> getAllIssues() {
        return issuesRepository.findAll();
    }

    @Override
    public void saveIssues(Issues issues) {
        this.issuesRepository.save(issues);
    }
}
