package com.bitpei.proofbitpei.controller;

import com.bitpei.proofbitpei.model.ChangePassword;
import com.bitpei.proofbitpei.model.Product;
import com.bitpei.proofbitpei.model.User;
import com.bitpei.proofbitpei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/usuarios/")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsuarios();
    }

    @GetMapping(path = "{prodID}")
    public User getUser(@PathVariable("prodID") Long id) {

        return userService.getUsuario(id);
    }//GETProduct

    @DeleteMapping(path = "{userID}")
    public User deleteUsuario(@PathVariable("userID") Long id) {
        return userService.deleteUsuario(id);
    }

    @PostMapping
    public User addUsuario(@RequestBody User usuario) {
        return userService.addUsuario(usuario);
    }

    @PutMapping(path = "{userId}")
    public User updateUsuario(@PathVariable("userId") Long id, @RequestBody ChangePassword changePassword) {
        return userService.updateUsuario(id, changePassword);
    }

}
