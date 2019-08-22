package com.qf.travel.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private int uid;
    private String uname;
    private String upwd;
    private String email;
    private String realname;
    private String tel;
    private String sex;
    private String birth;
    private String createtime;
}
