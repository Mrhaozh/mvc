package com.hzh.mvc.service.impl;

import com.hzh.mvc.dao.UserDaoMapper;
import com.hzh.mvc.entity.User;
import com.hzh.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDaoMapper mapper;
    @Override
    public List<User> listUsers() {
        return mapper.listUsers();
    }
}
