package com.zaratech.messaging.repositories;

import com.zaratech.messaging.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
