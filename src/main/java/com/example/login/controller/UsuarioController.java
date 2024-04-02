package com.example.login.controller;

import com.example.login.domain.Service.UsuarioService;
import com.example.login.domain.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Informando que e um controller.
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired // injetando o usuarioService no Controller
    UsuarioService usuarioService;

    @PostMapping //Informando que os dados serao enviados por post, informando que eu receberei os dados pelo corpo.
    public ResponseEntity<Usuario> login(@RequestBody Usuario usuario){

        return usuarioService.login(usuario);

    }


}
