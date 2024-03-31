package org.example.springcrud.repository;

import org.example.springcrud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCrudRepo extends JpaRepository<User, Long> {
}
