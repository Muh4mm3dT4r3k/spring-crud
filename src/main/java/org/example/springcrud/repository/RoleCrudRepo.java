package org.example.springcrud.repository;

import org.example.springcrud.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RoleCrudRepo extends JpaRepository<Role, Long> {

}
