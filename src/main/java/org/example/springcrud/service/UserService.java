package org.example.springcrud.service;

import org.example.springcrud.entity.User;
import org.example.springcrud.repository.UserCrudRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    @Autowired
    private UserCrudRepo userCrudRepo;


    @Transactional
    public void saveUser(User user) {
        userCrudRepo.save(user);
    }
}
