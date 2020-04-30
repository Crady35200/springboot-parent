package com.crady.service.impl;

import com.crady.dao.UserDao;
import com.crady.pojo.User;
import com.crady.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author :Crady
 * date :2020/04/30 10:08
 * desc :
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public List<User> queryAll() {
        return null;
    }

    @Override
    public User queryUserById(int id) {
        return userDao.selectByPrimaryKey(id);
    }
}
