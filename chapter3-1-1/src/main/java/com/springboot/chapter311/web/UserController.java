package com.springboot.chapter311.web;

import com.springboot.chapter311.domain.User;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @author haungsonglin
 * @version 2.0.0
 */
@RestController
@RequestMapping("/users")
public class UserController {
    static Map<Long, User> users = Collections.synchronizedMap(new HashMap<Long, User>());

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public List<User> getAllUsers() {
        List<User> result = new ArrayList<User>(users.values());
        return result;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addUser(@RequestBody User user) {
        users.put(user.getId(), user);
        return "success";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public String updateUser(@PathVariable Long id, @RequestBody User user) {
        User u = users.get(id);
        u.setName(user.getName());
        u.setAge(u.getAge());
        users.put(id, user);
        return "success";
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deteUser(@PathVariable Long id) {
        users.remove(id);
        return "success";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUserById(@PathVariable Long id) {
        return users.get(id);
    }
}
