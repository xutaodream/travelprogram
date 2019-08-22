package com.qf.travel.service;

import com.qf.travel.pojo.User;

import java.util.Map;

public interface UserService {
    /**
     * 注册界面判定名字、手机号、email是否重复
     * @param uname
     * @return
     */
    public boolean getUserByName(String uname);
    public boolean getUserByTel(String tel);
    public boolean getUserByEmail(String email);

    /**
     * 注册保存
     * @param user
     * @return
     */
    public boolean save(User user);
}
