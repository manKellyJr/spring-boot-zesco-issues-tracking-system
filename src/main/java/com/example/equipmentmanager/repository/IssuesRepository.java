package com.example.equipmentmanager.repository;

import com.example.equipmentmanager.model.Issues;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssuesRepository extends JpaRepository<Issues, Long> {
}
