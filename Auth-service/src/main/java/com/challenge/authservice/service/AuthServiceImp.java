package com.challenge.authservice.service;

import com.challenge.authservice.entity.UserCredential;
import com.challenge.authservice.repository.UserCredentialRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AuthServiceImp implements AuthService {
    private UserCredentialRepository userCredentialRepository;
    private PasswordEncoder passwordEncoder;
    private JwtService jwtService;
    public String SaveUser(UserCredential userCredential){
        userCredential.setPassword(passwordEncoder.encode(userCredential.getPassword()));
        userCredentialRepository.save(userCredential);
        return "User has been added successfully";
    }
    public String generateToken(String username){
        return jwtService.generateToken(username);
    }
    public void validateToken(String token){
         jwtService.validateToken(token);
    }

}
