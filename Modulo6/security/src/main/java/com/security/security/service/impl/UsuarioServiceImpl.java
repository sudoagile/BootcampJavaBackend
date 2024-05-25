package com.security.security.service.impl;

import com.security.security.entity.Usuario;
import com.security.security.repository.UsuarioRepository;
import com.security.security.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Override
    public UserDetailsService userDetailService() {
        return new UserDetailsService() {
            @Override
            public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
                Optional<Usuario> userOptional = usuarioRepository.findByUsername(username);
                if(userOptional.isPresent())
                {
                    Usuario usuario = userOptional.get();
                    return usuario;
                }
                else {
                    return null;
                }
            }
        };
    }
}
