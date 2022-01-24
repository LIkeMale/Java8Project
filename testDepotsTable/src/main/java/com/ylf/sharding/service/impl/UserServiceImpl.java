package com.ylf.sharding.service.impl;

import com.ylf.sharding.entity.Student;
import com.ylf.sharding.entity.User;
import com.ylf.sharding.mapper.StudentMapper;
import com.ylf.sharding.mapper.UserMapper;
import com.ylf.sharding.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ylfeng
 * @date 2022年01月17日 16:46
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Resource
    public UserMapper userMapper;

    @Resource
    public StudentMapper studentMapper;

    @Override
    public boolean insert(User u) {
        return userMapper.insert(u) > 0 ? true :false;
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public List<User> findByUserIds(List<Integer> ids) {
        return userMapper.findByUserIds(ids);
    }

    @Override
    @Transactional(propagation=Propagation.REQUIRED)
    public void transactionTestSucess() {
        User u = new User();
        u.setUserId(13);
        u.setAge(25);
        u.setName("war3 1.27");
        userMapper.insert(u);

        Student student = new Student();
        student.setStudentId(21);
        student.setAge(21);
        student.setName("hehe");
        studentMapper.insert(student);
    }

    @Override
    @Transactional(propagation= Propagation.REQUIRED)
    public void transactionTestFailure() throws IllegalAccessException {
        User u = new User();
        u.setUserId(13);
        u.setAge(25);
        u.setName("war3 1.27 good");
        userMapper.insert(u);

        Student student = new Student();
        student.setStudentId(21);
        student.setAge(21);
        student.setName("hehe1");
        studentMapper.insert(student);
        throw new IllegalAccessException();
    }
}
