package com.security.security.service;

import io.jsonwebtoken.Claims;
import org.springframework.security.core.userdetails.UserDetails;

public interface JwtService {
    // extractClaims
    Claims extractClaims(String token);
    String extractUsername(String token);
    String generateToken(UserDetails userDetails);
    boolean validateToken(String token);
}
