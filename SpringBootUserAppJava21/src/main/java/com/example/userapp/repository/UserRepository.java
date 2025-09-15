
package com.example.userapp.repository;

import com.example.userapp.model.User;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class UserRepository {
    private final Map<Integer, User> users = new HashMap<>();

    public List<User> findAll() {
        return new ArrayList<>(users.values());
    }

    public User findById(int id) {
        return users.get(id);
    }

    public void save(User user) {
        users.put(user.getId(), user);
    }

    public void delete(int id) {
        users.remove(id);
    }
}
