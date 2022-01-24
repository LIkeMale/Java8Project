package com.ylf.sharding.service;

import com.ylf.sharding.entity.User;

import java.util.List;

/**
 * @author ylfeng
 * @date 2022年01月17日 16:43
 */
public interface UserService {
    public boolean insert(User u);

    public List<User> findAll();

    public List<User> findByUserIds(List<Integer> ids);

    public void transactionTestSucess();

    public void transactionTestFailure() throws IllegalAccessException;
}
