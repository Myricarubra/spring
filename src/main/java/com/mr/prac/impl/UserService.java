package com.mr.prac.impl;

import com.mr.prac.dao.User;
import com.mr.prac.iface.IUserService;
import org.springframework.stereotype.Service;

/**
 * Created by zhangdong on 2018/5/28.
 */
@Service("userService")
public class UserService implements IUserService {
    @Override
    public void createUser(User user) {
        System.out.println("create user" + user);
    }
}
