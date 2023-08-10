package cn.minimal.dao;

import cn.minimal.pojo.UserInfo;
import org.apache.ibatis.annotations.Select;

public interface UserDao {
    @Select("select * from user where id=#{id}")
    UserInfo findUserById(int id);
}
