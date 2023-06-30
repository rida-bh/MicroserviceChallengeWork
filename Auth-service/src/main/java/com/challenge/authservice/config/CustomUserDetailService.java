package com.challenge.authservice.config;

import com.challenge.authservice.entity.UserCredential;
import com.challenge.authservice.repository.UserCredentialRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;


public class CustomUserDetailService implements UserDetailsService {
    @Autowired
    private UserCredentialRepository userCredentialRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<UserCredential> credential=userCredentialRepository.findByName(username);
        return credential.map(CustomUserDetails::new).orElseThrow(()->new UsernameNotFoundException("username not founded"+username));
    }
}
