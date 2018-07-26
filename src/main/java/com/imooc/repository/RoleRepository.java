package com.imooc.repository;

import com.imooc.entity.Role;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * 角色数据
 * @ Author     ：李华伟
 * @ Date       ：Created in 16:02 2018/7/26
 */
public interface RoleRepository extends CrudRepository<Role, Long> {
    List<Role> findRolesByUserId(Long userId);
}
