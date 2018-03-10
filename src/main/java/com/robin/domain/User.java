package com.robin.domain;  
/**  
 * ClassName:User <br/>  
 * Function:  <br/>  
 * Date:     2018年3月10日 上午10:26:29 <br/>       
 */
public class User {
    
    private Integer uid;
    
    private String uname;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    @Override
    public String toString() {
        return "User [uid=" + uid + ", uname=" + uname + "]";
    }

}
  
