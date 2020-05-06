package com.hzh.mvc.entity;

import lombok.Data;
import org.springframework.stereotype.Repository;

/**
 * @Description
 */
@Data
@Repository
public class User {
    private Integer id;
    private String name;
}
