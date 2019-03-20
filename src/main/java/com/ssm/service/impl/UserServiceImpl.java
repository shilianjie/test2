package com.ssm.service.impl;

import com.ssm.mapper.UserMapper;
import com.ssm.pojo.OrdersExpand;
import com.ssm.pojo.OrdersUser;
import com.ssm.pojo.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> selectList() {
        List<User> list = userMapper.selectList();
        return list;
    }

    @Override
    public List<OrdersExpand> selcetOrderWithUser() {
        List<OrdersExpand> ordersExpands = userMapper.selcetOrderWithUser();
        return ordersExpands;
    }

    @Override
    public List<OrdersExpand> selcetOrderWithUser2() {
        return userMapper.selcetOrderWithUser2();
    }

    @Override
    public List<OrdersUser> selcetOrderWithUser3() {
        return userMapper.selcetOrderWithUser3();
    }

}
