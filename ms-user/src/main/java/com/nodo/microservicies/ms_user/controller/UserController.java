package com.nodo.microservicies.ms_user.controller;

import com.nodo.microservicies.ms_user.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.nodo.microservicies.ms_user.services.UserService;

@RestController
@RequestMapping("api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public void saveUser(@RequestBody User user) {
        userService.save(user);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(userService.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok(userService.findById(id));
    }
}
