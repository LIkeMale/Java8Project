package com.ylf.sharding.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author ylfeng
 * @date 2022年01月17日 16:31
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable {
    private static final long serialVersionUID = 8920597824668331209L;

    private Integer id;

    private Integer studentId;

    private String name;

    private Integer age;

}
