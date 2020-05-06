package com.hzh.mvc.dao;

import com.hzh.mvc.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description
 */
@Repository
public interface UserDaoMapper {
    List<User> listUsers();
}
