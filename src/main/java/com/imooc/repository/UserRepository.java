package com.imooc.repository;

import com.imooc.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @ Author     ：李华伟
 * @ Date       ：Created in 14:15 2018/7/25
 */
public interface UserRepository extends CrudRepository<User,Long> {

}
