package com.arkssss.dao.user;

import com.arkssss.pojo.User;
import org.apache.ibatis.annotations.Select;


public interface UserMapper {

    /**
     * 测试 mybatis
     * @param id ： id
     * @return : User entity
     */
    User getUserById(Integer id);


}
