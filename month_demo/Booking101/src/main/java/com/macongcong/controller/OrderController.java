package com.macongcong.controller;/*
 作者:马聪聪
 时间:2019-11-25 14:48
    */

        import com.macongcong.entity.City;
        import com.macongcong.entity.Order;
        import com.macongcong.entity.Rouad;
        import com.macongcong.service.OrderService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.*;

        import java.util.List;

/**
 * @Description
 * @Author M_cc
 * @Date 2019-11-25-14:48
 */
@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping("citys")
    public List<City> cityList(){
        List<City> list =  orderService.cityList();
        return list;
    }
    @GetMapping("/roaud/{id}")
    public List<Rouad> cityList(@PathVariable("id") int id){
        List<Rouad> list =  orderService.roaudList(id);
        return list;
    }
    @PostMapping("add")
    public String addList(@RequestBody Order order){
        orderService.add(order);
        return "success";
    }
}
