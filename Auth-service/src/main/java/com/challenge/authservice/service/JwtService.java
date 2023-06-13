package com.challenge.authservice.service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class JwtService {
    final static String SECRET="b5817e9a7814d9a95f4baac9a90a393c98065d3c5906cef8d5266781bd33ed7c";
    public void validateToken(final String token){
        Jwts.parserBuilder().setSigningKey(getSignkey()).build().parseClaimsJws(token);
    }
    public String generateToken(String username){
        Map<String,Object> claims =new HashMap<>();
        return createToken(claims,username);
    }
    public String createToken(Map<String,Object> claims, String username){
            return Jwts.builder()
                    .setClaims(claims)
                    .setSubject(username)
                    .setIssuedAt(new Date(System.currentTimeMillis()))
                    .setExpiration(new Date(System.currentTimeMillis()+ 1000*60*30) )
                    .signWith(getSignkey(), SignatureAlgorithm.HS256).compact();
    }

    private Key getSignkey() {
        byte[] keyBytes= Decoders.BASE64.decode(SECRET);
        return Keys.hmacShaKeyFor(keyBytes);
    }
}
