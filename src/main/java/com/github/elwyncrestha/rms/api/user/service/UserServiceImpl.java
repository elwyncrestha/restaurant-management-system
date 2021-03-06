package com.github.elwyncrestha.rms.api.user.service;

import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.github.elwyncrestha.rms.api.user.entity.User;
import com.github.elwyncrestha.rms.api.user.repository.UserRepository;

/**
 * @author Elvin Shrestha on 8/28/2020
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    public UserServiceImpl(
        UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User save(User user) {
        return repository.save(user);
    }

    @Override
    public User getOne(Long id) {
        return repository.getOne(id);
    }

    @Override
    public List<User> getAll() {
        return repository.findAll();
    }

    @Override
    public User getAuthenticated() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication.getPrincipal() instanceof String) {
            return repository.findUserByUsername(authentication.getPrincipal().toString());
        } else {
            throw new UsernameNotFoundException(
                "User is not authenticated; Found " + " of type " + authentication.getPrincipal()
                    .getClass() + "; Expected type User");
        }
    }
}
