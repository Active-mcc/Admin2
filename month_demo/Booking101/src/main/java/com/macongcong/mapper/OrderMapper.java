package com.macongcong.mapper;/*
 作者:马聪聪
 时间:2019-11-25 14:49   
    */

import com.macongcong.entity.City;
import com.macongcong.entity.Order;
import com.macongcong.entity.Rouad;

import java.util.List;

/**
 * @Description
 * @Author M_cc
 * @Date 2019-11-25-14:49
 */
public interface OrderMapper {

    List<City> cityList();

    List<Rouad> rouadList(int id);

    void add(Order order);
}
