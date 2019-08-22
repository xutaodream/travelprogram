package com.qf.travel.mapper;

import com.qf.travel.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

import javax.jws.soap.SOAPBinding;
import java.net.UnknownServiceException;
import java.util.Map;

@Mapper
public interface UserMapper {
    /**
     * 根据姓名查询user
     * @param uname
     * @return
     */
    public User getUserByName(String uname);

    /**
     * tel
     * @param tel
     * @return
     */
    public User getUserByTel(String tel);
    public User getUserByEmail(String email);

    /**
     * 注册
     * @param user
     * @return
     */
    public int save(User user);
}
