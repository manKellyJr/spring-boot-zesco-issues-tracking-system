package com.example.equipmentmanager.service;

import com.example.equipmentmanager.model.User;
import com.example.equipmentmanager.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
