package cn.minimal.service.Impl;

import cn.minimal.dao.UserDao;
import cn.minimal.pojo.UserInfo;
import cn.minimal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    public UserInfo findUserById(int id){
        return userDao.findUserById(id);
    }
}
