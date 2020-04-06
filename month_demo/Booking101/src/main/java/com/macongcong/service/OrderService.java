package com.macongcong.service;/*
 作者:马聪聪
 时间:2019-11-25 14:49   
    */

import com.macongcong.entity.City;
import com.macongcong.entity.Order;
import com.macongcong.entity.Rouad;
import com.macongcong.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Author M_cc
 * @Date 2019-11-25-14:49
 */
@Service
public class OrderService {
    @Autowired
    private OrderMapper orderMapper;

    public  List<City>  cityList() {
        List<City> list = orderMapper.cityList();
        return list;
    }

    public List<Rouad> roaudList(int id) {
        List<Rouad> list = orderMapper.rouadList(id);
        return list;
    }

    public void add(Order order) {
        orderMapper.add(order);
    }
}
