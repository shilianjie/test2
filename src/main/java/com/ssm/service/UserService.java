package com.ssm.service;

import com.ssm.pojo.OrdersExpand;
import com.ssm.pojo.OrdersUser;
import com.ssm.pojo.User;

import java.util.List;

public interface UserService {
    List<User> selectList();
    List<OrdersExpand> selcetOrderWithUser();
    List<OrdersExpand> selcetOrderWithUser2();
    List<OrdersUser> selcetOrderWithUser3();
}
