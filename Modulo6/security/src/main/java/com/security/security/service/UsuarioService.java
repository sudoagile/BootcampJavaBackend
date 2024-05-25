package com.security.security.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UsuarioService {
    UserDetailsService userDetailService();
}
