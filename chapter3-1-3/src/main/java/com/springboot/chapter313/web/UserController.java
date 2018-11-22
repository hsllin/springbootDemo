package com.springboot.chapter313.web;

import com.springboot.chapter313.domain.User;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
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

    @ApiOperation(value = "查询所有用户")
    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public List<User> getAllUsers() {
        List<User> result = new ArrayList<User>(users.values());
        return result;
    }

    @ApiOperation(value = "添加一个用户")
    @ApiImplicitParam(name = "user", value = "用户实体", required = true, dataType = "User")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addUser(@RequestBody User user) {
        users.put(user.getId(), user);
        return "success";
    }

    @ApiOperation(value = "id", notes = "根据id和用户更新用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "id", required = true, dataType = "Long", paramType = "path"),
            @ApiImplicitParam(name = "user", value = "user", required = true, dataType = "User")})
    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public String updateUser(@PathVariable Long id, @RequestBody User user) {
        User u = users.get(id);
        u.setName(user.getName());
        u.setAge(u.getAge());
        users.put(id, user);
        return "success";
    }

    @ApiOperation(value = "id", notes = "根据id删除用户")
    @ApiImplicitParam(name = "id", value = "用户id",required = true,dataType = "Long")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deteUser(@PathVariable Long id) {
        users.remove(id);
        return "success";
    }
    @ApiOperation(value = "id", notes = "根据id删除用户")
    @ApiImplicitParam(name = "id", value = "用户id")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUserById(@PathVariable Long id) {
        return users.get(id);
    }
}
