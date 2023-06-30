package com.challenge.authservice.service;

import com.challenge.authservice.entity.UserCredential;

import java.util.List;

public interface AuthService {
    String SaveUser(UserCredential userCredential);
    String generateToken(String username);
    void validateToken(String token);
}
