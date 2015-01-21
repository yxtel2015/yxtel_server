package cn.com.yxtel.bean.account;

import java.io.Serializable;

/**
 * user测试类
 * Created by lishilong on 2014/12/18.
 */
public class UserBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String userName;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
