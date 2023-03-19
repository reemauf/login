package com.example.login;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")

public class controller {
    @PostMapping(path = "/login")
    public String checklogin(@RequestBody user testuser) {

        if (testuser.username.equals("admin") && testuser.password.equals("admin")) {
            return "Success";
        } else {
            return "Failed to login";
        }
    }
}


