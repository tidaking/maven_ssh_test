package com.robin.dao.impl;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.robin.dao.UserDao;
import com.robin.domain.User;

/**  
 * ClassName:UserDaoImpl <br/>  
 * Function:  <br/>  
 * Date:     2018年3月10日 上午11:06:04 <br/>       
 */
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

    @Override
    public User findById(int uid) {
        System.out.println("[User][Dao]findById");
        return getHibernateTemplate().get(User.class, uid);
    }

}
  
