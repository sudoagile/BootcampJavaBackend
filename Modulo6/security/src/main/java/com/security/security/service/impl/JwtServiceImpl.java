package com.security.security.service.impl;

import com.security.security.service.JwtService;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.core.userdetails.UserDetails;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.function.Function;

public class JwtServiceImpl implements JwtService {
    private String key;
    @Override
    public Claims extractClaims(String token) {
        return Jwts.parser()
                .setSigningKey(key)
                .parseClaimsJwt(token)
                .getBody();
    }

    @Override
    public String extractUsername(String token) {
        return "";
    }

    @Override
    public String generateToken(UserDetails userDetails) {
        return Jwts.builder()
                .setSubject(userDetails.getUsername())
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 12000))
                .signWith(SignatureAlgorithm.HS256, key)
                .compact();
    }

    @Override
    public boolean validateToken(String token) {
        return false;
    }

    private <T> T extractClaim(String token, Function<Claims, T> claimAction)
    {
        Claims claimsToken = extractClaims(token);
        return claimAction.apply(claimsToken);
    }
    private boolean isTokenExpired(String token)
    {
        return extractClaim(token, Claims::getExpiration).before(new Date());
    }
}
