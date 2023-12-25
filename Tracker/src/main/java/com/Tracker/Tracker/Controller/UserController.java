package com.Tracker.Tracker.Controller;
import com.Tracker.Tracker.Entity.User;
import com.Tracker.Tracker.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public String add(@RequestBody User user) {
        userService.saveUser(user);
        return "New Product is added";
    }
}
