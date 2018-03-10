package com.robin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.robin.dao.UserDao;
import com.robin.domain.User;
import com.robin.service.UserService;

/**  
 * ClassName:UserServiceImpl <br/>  
 * Function:  <br/>  
 * Date:     2018年3月10日 上午11:18:21 <br/>       
 */
@Component("userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    
    @Override
    public User findById(int uid) {
        System.out.println("[User][Service]findById");
        return userDao.findById(uid);
    }

}
  
