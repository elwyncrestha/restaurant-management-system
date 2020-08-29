package com.github.elwyncrestha.rms.api.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.elwyncrestha.rms.api.user.entity.User;

/**
 * @author Elvin Shrestha on 8/28/2020
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByUsername(String username);
}
