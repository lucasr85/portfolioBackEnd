package com.portfolio.Portfolio.Security.Service;

import com.portfolio.Portfolio.Security.Entity.Usuario;
import com.portfolio.Portfolio.Security.Entity.UsuarioPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lucas Robles
 */
@Service
public class UserDetailsImpl implements UserDetailsService {

    @Autowired
    UsuarioService usuarioService;

    @Override
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
        Usuario usuario = usuarioService.getByNombreUsuario(nombreUsuario).get();//dios mio el netbeans no tabula
        UsuarioPrincipal usuarioPrincipal = UsuarioPrincipal.builder()
                .nombre(usuario.getNombre())
                .nombreUsuario(usuario.getNombreUsuario())
                .email(usuario.getEmail())
                .password(usuario.getPassword())
                .build();

        return usuarioPrincipal;
    }
}
