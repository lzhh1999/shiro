package com.lzhhuo.shiro.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author lzhhuo
 * @since 2019-11-06 15:58:42
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 210687148890205201L;
    
    private Integer id;
    
    private String username;
    
    private String password;
    /**
    * shiro授权字段
    */
    private String perms;
}