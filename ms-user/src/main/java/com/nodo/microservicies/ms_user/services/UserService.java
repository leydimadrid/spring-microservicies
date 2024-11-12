package com.nodo.microservicies.ms_user.services;

import com.nodo.microservicies.ms_user.entities.User;
import com.nodo.microservicies.ms_user.persistence.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private IUserRepository userRepository;


    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }


    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow();
    }


    public void save(User user) {
        userRepository.save(user);
    }
}
