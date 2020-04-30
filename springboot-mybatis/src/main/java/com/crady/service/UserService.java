package com.crady.service;

import com.crady.pojo.User;

import java.util.List;

/**
 * @author :Crady
 * date :2020/04/30 10:08
 * desc :
 **/
public interface UserService {

    List<User> queryAll();

    User queryUserById(int id);
}
