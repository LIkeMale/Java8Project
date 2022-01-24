package com.ylf.sharding.mapper;

import com.ylf.sharding.entity.User;

import java.util.List;

/**
 * @author ylfeng
 * @date 2022年01月17日 16:41
 */
public interface UserMapper {
    Integer insert(User u);

    List<User> findAll();

    List<User> findByUserIds(List<Integer> userIds);
}
