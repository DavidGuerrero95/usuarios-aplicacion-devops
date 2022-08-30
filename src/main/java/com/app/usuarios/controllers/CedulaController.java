package com.app.usuarios.controllers;

import com.app.usuarios.models.Usuario;
import com.app.usuarios.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cedula")
public class CedulaController {

    @Autowired
    UsuarioRepository uRepository;

    @GetMapping("/verificar/editar/{username}")
    @ResponseStatus(code = HttpStatus.OK)
    public Boolean modificoCedula(@PathVariable("username") String username){
        Usuario usuario = uRepository.findByUsername(username);
        return usuario.getVCedula();
    }

}
