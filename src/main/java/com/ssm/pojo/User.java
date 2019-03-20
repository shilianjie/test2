package com.ssm.pojo;

import java.util.Date;

public class User {
    private Integer uid;
    private String uname;
    private String sex;
    private Date birthday;

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public User() {
    }

    public User(Integer uid, String uname, String sex, Date birthday) {
        this.uid = uid;
        this.uname = uname;
        this.sex = sex;
        this.birthday = birthday;
    }

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
}
