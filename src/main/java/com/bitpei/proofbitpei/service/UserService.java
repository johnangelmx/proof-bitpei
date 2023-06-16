package com.bitpei.proofbitpei.service;

import com.bitpei.proofbitpei.model.ChangePassword;
import com.bitpei.proofbitpei.model.User;
import com.bitpei.proofbitpei.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsuarios() {
        return userRepository.findAll();
    }

    public User getUsuario(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("El usuario " + id + " no existe"));
    }

    public User deleteUsuario(Long id) {
        Optional<User> optionalProduct = userRepository.findById(id);
        if (optionalProduct.isPresent()) {
            User user = optionalProduct.get();
            // Realizar la desvinculación o desactivación del producto
            user.setActive(false);
            userRepository.save(user);

            return user;
        }

        return null;
    }

    public User addUsuario(User usuario) {
        User tmp = null;
        if (userRepository.findByEmail(usuario.getEmail()).isEmpty()) {
            tmp = userRepository.save(usuario);
        }
        return tmp;
    }

    public User updateUsuario(Long id, ChangePassword changePassword) {
        User tmp = null;
        if (userRepository.existsById(id)) {
            if (changePassword.getPassword() != null && changePassword.getNewPassword() != null) {
                tmp = userRepository.findById(id).get();
                if (tmp.getPassword().equals(changePassword.getPassword())) {
                    tmp.setPassword((changePassword.getNewPassword()));
                    userRepository.save(tmp);
                } else {
                    tmp = null;
                }
            }
        } else {
            System.out.println("Update - El usuario con el id " + id + " no existe");
        }
        return tmp;
    }// Update User
}

