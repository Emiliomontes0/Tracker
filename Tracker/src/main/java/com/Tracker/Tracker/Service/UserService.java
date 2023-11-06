package com.Tracker.Tracker.Service;

import com.Tracker.Tracker.Entity.User;

public interface UserService {
    User saveUser (User user);
    void deleteUser (User user);
    User updateUser (User user);


}
