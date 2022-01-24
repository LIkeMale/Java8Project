package com.ylf.sharding.mapper;

import com.ylf.sharding.entity.Student;

import java.util.List;

/**
 * @author ylfeng
 * @date 2022年01月17日 16:41
 */
public interface StudentMapper {
    Integer insert(Student s);

    List<Student> findAll();

    List<Student> findByStudentIds(List<Integer> studentIds);
}
