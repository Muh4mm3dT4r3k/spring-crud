package org.example.springcrud.service;

import org.example.springcrud.entity.Role;
import org.example.springcrud.repository.RoleCrudRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RoleService {
    @Autowired
    private RoleCrudRepo roleCrudRepo;

    @Transactional
    public List<Role> getRoles(){
        return roleCrudRepo.findAll();
    }
}
