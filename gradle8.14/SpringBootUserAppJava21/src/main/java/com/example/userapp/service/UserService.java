
package com.example.userapp.service;

import com.example.userapp.model.User;
import com.example.userapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUser(int id) {
        return userRepository.findById(id);
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public void deleteUser(int id) {
        userRepository.delete(id);
    }
}
