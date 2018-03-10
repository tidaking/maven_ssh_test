package com.robin.dao;

import com.robin.domain.User;

/**  
 * ClassName:UserDao <br/>  
 * Function:  <br/>  
 * Date:     2018年3月10日 上午11:04:20 <br/>       
 */
public interface UserDao {
    public User findById(int uid);
}
  
