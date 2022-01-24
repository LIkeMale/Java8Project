package com.ylf.sharding.service.impl;

import com.ylf.sharding.entity.Student;
import com.ylf.sharding.mapper.StudentMapper;
import com.ylf.sharding.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ylfeng
 * @date 2022年01月17日 16:47
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    public StudentMapper studentMapper;
    @Override
    public boolean insert(Student student) {
        return studentMapper.insert(student) > 0 ? true : false;
    }

}
