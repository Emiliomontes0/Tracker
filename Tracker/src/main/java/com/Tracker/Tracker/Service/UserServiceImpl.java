package com.Tracker.Tracker.Service;

import com.Tracker.Tracker.Entity.User;
import com.Tracker.Tracker.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Add in @Service for required bean type
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    public User saveUser(User user){
        return userRepository.save(user);
    }
    public void deleteUser(User user){
        userRepository.delete(user);
    }
    public User updateUser(User user){
        return userRepository.save(user);
    }

}
