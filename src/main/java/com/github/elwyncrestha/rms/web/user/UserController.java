package com.github.elwyncrestha.rms.web.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.elwyncrestha.rms.api.user.service.UserService;

/**
 * @author Elvin Shrestha on 8/28/2020
 */
@RestController
@RequestMapping(UserController.URL)
public class UserController {

    static final String URL = "/api/users";
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping("/authenticated")
    public ResponseEntity<?> getAuthenticated() {
        return ResponseEntity.ok(service.getAuthenticated());
    }

}
