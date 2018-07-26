package com.imooc.service;

import com.imooc.entity.User;

/**
 * @ Author     ：李华伟
 * @ Date       ：Created in 15:51 2018/7/26
 */
public interface IUserService {
    User findUserByName(String userName);
}
