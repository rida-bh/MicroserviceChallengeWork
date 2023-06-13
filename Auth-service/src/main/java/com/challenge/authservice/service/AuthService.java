package com.challenge.authservice.service;

import com.challenge.authservice.entity.UserCredential;

public interface AuthService {
    String SaveUser(UserCredential userCredential);
    String generateToken(String username);
    void validateToken(String token);
}
