package com.challenge.authservice.controller;

import com.challenge.authservice.dto.AuthRequest;
import com.challenge.authservice.entity.UserCredential;
import com.challenge.authservice.service.AuthService;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/auth")
public class AuthController {
    AuthenticationManager authenticationManager;
    private AuthService authService;
    @PostMapping("/register")
    public String addNewUser(@RequestBody UserCredential userCredential){
        return authService.SaveUser(userCredential);
    }
    @PostMapping ("/token")
    public String getToken(@RequestBody AuthRequest authRequest){
        Authentication authentication =authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getUsername(),authRequest.getPassword()));
        if(authentication.isAuthenticated()){
            return authService.generateToken(authRequest.getUsername());
        }
        else throw new RuntimeException("Invalid Access");
    }
    @GetMapping ("/validate")
    public String validateToken(@RequestParam("token") String token){
        authService.validateToken(token);
        return "token is valid";
    }
}
