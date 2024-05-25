package com.security.security.service;

import com.security.security.entity.Usuario;

public interface AuthenticationService {
    Usuario singUpUser(Usuario usuario);
    Usuario singUpAdmin(Usuario usuario);
    Usuario singInUser(Usuario usuario);
}
