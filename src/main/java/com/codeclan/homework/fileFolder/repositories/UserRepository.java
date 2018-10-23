package com.codeclan.homework.fileFolder.repositories;

import com.codeclan.homework.fileFolder.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
