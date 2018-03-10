package com.robin.web.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.robin.domain.User;
import com.robin.service.UserService;

/**  
 * ClassName:UserAction <br/>  
 * Function:  <br/>  
 * Date:     2018年3月10日 上午11:15:00 <br/>       
 */
@Component
@Scope("prototype")
public class UserAction extends ActionSupport implements ModelDriven<User> {
    
    private static final long serialVersionUID = 4284369622320738560L;
    
    private User model = new User();
    
    @Override
    public User getModel() {
        return model;
    }
    
    
    private Integer id;

    public void setId(Integer id) {
        this.id = id;
    }

    @Autowired
    private UserService userService;
    
    public String findById() {
        System.out.println("[User][Action]findById");
        model = userService.findById(id);
        System.out.println("user:"+model);
        return "success";
    }

   
}
  
