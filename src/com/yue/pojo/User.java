package com.yue.pojo;

/**
 * @author 岳岳
 * version  1.0
 */
public class User {
    private Integer userno;
    private String userid;
    private String userpassword;
    private String sex;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String username;

    @Override
    public String toString() {
        return "User{" +
                "userno=" + userno +
                ", userid='" + userid + '\'' +
                ", userpassword='" + userpassword + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public Integer getUserno() {
        return userno;
    }

    public void setUserno(Integer userno) {
        this.userno = userno;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
