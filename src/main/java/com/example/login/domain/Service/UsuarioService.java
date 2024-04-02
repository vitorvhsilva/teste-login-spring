package com.example.login.domain.Service;

import com.example.login.domain.model.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service //informado que e um servico
public class UsuarioService {

    public ResponseEntity<Usuario> login(Usuario usuario) {
        if (usuario.getEmail().equals("gablindo") && usuario.getSenha().equals("123")) {
            return ResponseEntity.ok(usuario);
        }
        return ResponseEntity.badRequest().build();// .build constroi pq n tem nada no corpo
    }

}
