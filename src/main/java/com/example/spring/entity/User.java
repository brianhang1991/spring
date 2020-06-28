package com.example.spring.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName( value = "user")
public class User {
    @TableId(value = "id")
    private Integer id;
    @TableField(value = "name")
    private String name;
}
