package com.ssm.pojo;

public class OrdersExpand extends Orders {
    private User user;

    @Override
    public String toString() {
        return "OrdersExpand{" +
                super.toString()+
                "user=" + user +
                '}';
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
