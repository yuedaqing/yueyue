package com.yue.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author 岳岳
 * version  1.0
 */
public class Student {
    private Integer stuno;
    private String stuname;
    private String sex;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    private Integer userno;

    @Override
    public String toString() {
        return "Student{" +
                "stuno=" + stuno +
                ", stuname='" + stuname + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", userno=" + userno +
                '}';
    }

    public Integer getStuno() {
        return stuno;
    }

    public void setStuno(Integer stuno) {
        this.stuno = stuno;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getUserno() {
        return userno;
    }

    public void setUserno(Integer userno) {
        this.userno = userno;
    }
}
