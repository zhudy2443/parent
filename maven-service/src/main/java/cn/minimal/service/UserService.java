package cn.minimal.service;

import cn.minimal.pojo.UserInfo;

public interface UserService {
    UserInfo findUserById(int id);
}
