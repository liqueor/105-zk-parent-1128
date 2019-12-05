package com.qy105.aaa.service.userservice.impl;

import com.qy105.aaa.mapper.UserMapper;
import com.qy105.aaa.model.Perm;
import com.qy105.aaa.model.Role;
import com.qy105.aaa.model.User;
import com.qy105.aaa.service.bookservice.impl.BookServiceImpl;
import com.qy105.aaa.service.userservice.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private static Logger logger = LoggerFactory.getLogger(BookServiceImpl.class);
    @Autowired
    private UserMapper userMapper;
    @Override
    public User login(String name) {
        if (name == null) {
            logger.warn("use is null");
            return null;
    }
        else {
            return userMapper.login(name);
        }
    }

    @Override
    public void ins(User user) {
        if (user==null) {
            logger.warn("user is null");

        }else {
            userMapper.ins(user);
        }
    }

    @Override
    public List<Role> getRoleByUserName(String userName) {
        List<Role> list = userMapper.getRoleByUserName(userName);
        return list;
    }

    @Override
    public List<Perm> getPermByUserName(String userName) {
        return userMapper.getPermByUserName(userName);
    }
}
